package com.wsw.usercenter01.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wsw.usercenter01.model.domain.User;
import com.wsw.usercenter01.service.UserService;
import com.wsw.usercenter01.mapper.UserMapper;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.wsw.usercenter01.constant.UserConstant.USER_LOGIN_STATE;

/**
 * 用户服务实现类
* @author loriyuhv
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2023-12-06 16:33:52
*/
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{
    /**
     * 盐值：混淆密码
     */
    private static final String SALT = "Jerry";



    @Autowired
    UserMapper userMapper;

    @Override
    public long userRegister(String userAccount, String userPassword, String checkPassword) {
        // 1. 校验
        // if (userAccount == null || userPassword == null || checkPassword == null)
        if (StringUtils.isAnyBlank(userAccount, userPassword, checkPassword)) {
            // todo 修改为自定义异常
            return -1;
        }
        if (userAccount.length() < 4) {
            return -1;
        }

        if (userPassword.length() < 8 || checkPassword.length() < 8) {
            return -1;
        }
        // 账户不能包含特殊字符
        // 匹配所有特殊字符
        String regEx="[`~!@#$%^&*()+=|{}':; ',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        Matcher matcher = Pattern.compile(regEx).matcher(userAccount);
        if (matcher.find()) {
            return -1;
        }

        // 密码和校验密码相同
        if (!userPassword.equals(checkPassword)) {
            return -1;
        }

        // 账户不能重复
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userAccount", userAccount);
        long count = this.count(queryWrapper);
        if (count > 0) {
            return -1;
        }
        // 2. 对密码进行加密
        String encryptPassword = DigestUtils.md5DigestAsHex((SALT + userPassword).getBytes());

        // 3. 插入数据
        User user = new User();
        user.setUserAccount(userAccount);
        user.setUserPassword(encryptPassword);
        boolean saveResult = this.save(user);
        System.out.println(saveResult);
        if (!saveResult) {
            return -1;
        }
        return user.getId();
    }

    @Override
    public User userLogin(String userAccount, String userPassword, HttpServletRequest request) {
        // 1. 校验用户账户和密码是否合法
        // 1）非空
        if (StringUtils.isAnyBlank(userAccount, userPassword)) {
            return null;
        }
        // 2） 账户的话不小于4位
        if (userAccount.length() < 4) {
            return null;
        }
        // 3） 密码不小于8位
        if (userPassword.length() < 8) {
            return null;
        }
        // 4） 账户不包含特殊字符
        String regEx="[`~!@#$%^&*()+=|{}':; ',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        Matcher matcher = Pattern.compile(regEx).matcher(userAccount);
        if (matcher.find()) {
            return null;
        }

        // 2. 校验密码是否输入正确，要和数据库中的密文密码去对比
        // 1）对密码进行加密
        String encryptPassword = DigestUtils.md5DigestAsHex((SALT + userPassword).getBytes());
        // 2）查询用户是否存在
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userAccount", userAccount);        // 判断登录用户是否和数据库的用户相等
        queryWrapper.eq("userPassword", encryptPassword);   // 判断登录密码（加密）是否和数据库的密码（加密）相等
        User user = userMapper.selectOne(queryWrapper);
        if (user == null) {
            log.info("user login failed! userAccount cannot match userPassword");
            return null;
        }
        // 3. 返回用户信息（脱敏）
        User safetyUser = getSafetyUser(user);

        // 4. 记录用户的登录态（session）
        request.getSession().setAttribute(USER_LOGIN_STATE, safetyUser);
        return safetyUser;
    }

    /**
     * 用户脱敏
     * @param originUser 源user对象
     * @return 安全的user对象
     */
    @Override
    public User getSafetyUser(User originUser) {
        User safetyUser = new User();
        safetyUser.setId(originUser.getId());
        safetyUser.setUsername(originUser.getUsername());
        safetyUser.setUserAccount(originUser.getUserAccount());
        safetyUser.setAvatarUrl(originUser.getAvatarUrl());
        safetyUser.setGender(originUser.getGender());
        safetyUser.setPhone(originUser.getPhone());
        safetyUser.setEmail(originUser.getEmail());
        safetyUser.setUserStatus(originUser.getUserStatus());
        safetyUser.setUserRole(originUser.getUserRole());
        safetyUser.setCreateTime(originUser.getCreateTime());
        return safetyUser;
    }
}




