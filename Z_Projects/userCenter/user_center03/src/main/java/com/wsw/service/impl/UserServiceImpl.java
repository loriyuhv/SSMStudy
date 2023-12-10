package com.wsw.service.impl;
import java.util.Date;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wsw.constant.UserConstant;
import com.wsw.domain.User;
import com.wsw.service.UserService;
import com.wsw.mapper.UserMapper;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 用户服务实现类
* @author loriyuhv
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2023-12-09 15:34:49
*/
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{
    /**
     * 盐值：混淆密码
     */
    private static final String SALT = "Jerry";

    /**
     * 用户注册接口实现类
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 用户校验密码
     * @return 状态值
     */
    @Override
    public long userRegister(String userAccount, String userPassword, String checkPassword) {
        // 1. 校验用户的账户，密码、校验密码是否符合要求
        // 1) 非空
        if (StringUtils.isAnyBlank(userAccount, userPassword, checkPassword)) {
            // todo 修改为自定义异常
            return -1;
        }
        // 2) 账户的话不小于4位
        if (userAccount.length() < 4) {
            return -1;
        }
        // 3) 密码不小于8位
        if (userPassword.length() < 8 && checkPassword.length() < 8) {
            return -1;
        }
        // 4) 账户不包含特殊字符
        // 匹配所有特殊字符
        String regEx="[`~!@#$%^&*()+=|{}':; ',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        Matcher matcher = Pattern.compile(regEx).matcher(userAccount);
        if (matcher.find()) {
            return -1;
        }
        // 5) 密码和校验密码相同
        if (!userPassword.equals(checkPassword)) {
            return -1;
        }
        // 6) 账户不能重复
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userAccount", userAccount);
        long count = this.count(queryWrapper);
        if (count > 0) {
            return -1;
        }

        // 3. 对密码进行加密（密码千万不要直接以明文存储到数据库中）
        String encryptPassword = DigestUtils.md5DigestAsHex((SALT + userPassword).getBytes());

        // 4. 向数据库插入用户数据
        User user = new User();
        user.setUserAccount(userAccount);
        user.setUserPassword(encryptPassword);
        boolean saveResult = this.save(user);
        if (!saveResult) {
            return -1;
        }
        // 返回插入成功的数据的主键Id
        return user.getId();
    }

    /**
     * 用户登录接口实现类
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param request 用户请求体
     * @return 响应体（数据脱敏的用户信息）
     */
    @Override
    public User userLogin(String userAccount, String userPassword, HttpServletRequest request) {
        // 1. 校验用户账户和密码是否合法
        // 1）非空
        if (StringUtils.isAnyBlank(userAccount, userPassword)) {
            return null;
        }
        // 2）账户的话不小于4位
        if (userAccount.length() < 4) {
            return null;
        }
        // 3）密码不小于8位
        if (userPassword.length() < 8) {
            return null;
        }
        // 2. 账户不包含特殊字符
        String regEx="[`~!@#$%^&*()+=|{}':; ',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        Matcher matcher = Pattern.compile(regEx).matcher(userAccount);
        if (matcher.find()) {
            return null;
        }
        // 3. 校验密码是否输入正确，要和数据库中的密文密码去对比
        // 1) 对密码进行加密
        String encryptPassword = DigestUtils.md5DigestAsHex((SALT + userPassword).getBytes());
        // 2）查询用户是否存在
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userAccount", userAccount);
        queryWrapper.eq("userPassword", encryptPassword);
        User user = this.getOne(queryWrapper);
        if (user == null) {
            log.info("user login failed! userAccount cannot match userPassword");
            return null;
        }
        // 3. 返回用户信息（数据脱敏）
        // 1）对源用户信息进行数据脱敏
        User safeUser = getSafeUser(user);
        // 2）记录用户的登录态（session）
        request.getSession().setAttribute(UserConstant.USER_LOGIN_STATE, safeUser);
        return safeUser;
    }

    /**
     * 对用户信息进行数据脱敏
     * @param originUser 源user对象
     * @return 数据脱敏的user对象
     */
    @Override
    public User getSafeUser(User originUser) {
        User safeUser = new User();
        safeUser.setId(originUser.getId());
        safeUser.setUsername(originUser.getUsername());
        safeUser.setUserAccount(originUser.getUserAccount());
        safeUser.setAvatarUrl(originUser.getAvatarUrl());
        safeUser.setGender(originUser.getGender());
        safeUser.setPhone(originUser.getPhone());
        safeUser.setEmail(originUser.getEmail());
        safeUser.setUserStatus(originUser.getUserStatus());
        safeUser.setUserRole(originUser.getUserRole());
        safeUser.setCreateTime(originUser.getCreateTime());
        return safeUser;
    }
}




