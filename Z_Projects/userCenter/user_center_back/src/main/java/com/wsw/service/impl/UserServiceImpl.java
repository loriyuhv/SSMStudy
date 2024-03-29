package com.wsw.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wsw.common.ErrorCode;
import com.wsw.exception.BusinessException;
import com.wsw.model.domain.User;
import com.wsw.model.request.UserRegisterRequest;
import com.wsw.service.UserService;
import com.wsw.mapper.UserMapper;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.wsw.constant.UserConstant.USER_LOGIN_STATE;

/**
* @author lroiyuhv
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2023-12-13 14:39:20
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

    /**
     * 用户登录实现类
     * @return UserLoginResult
     */
    @Override
    public User userLoginAccount(String username, String password, HttpServletRequest request) {
        // 1. 基本校验
        if (!Boolean.TRUE.equals(checkLoginParams(username, password))) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 2. 校验密码是否输入正确，要和数据库中的密文密码去对比
        // 1）对密码进行加密
        String encryptPassword = DigestUtils.md5DigestAsHex((SALT + password).getBytes());
        // 2）查询用户是否存在
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);        // 判断登录用户是否和数据库的用户相等
        queryWrapper.eq("password", encryptPassword);   // 判断登录密码（加密）是否和数据库的密码（加密）相等
        User user = userMapper.selectOne(queryWrapper);
        if (user == null) {
            log.info("user login failed! username cannot match password");
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 3. 返回用户信息（脱敏）
        User safetyUser = getSafetyUser(user);

        // 4. 记录用户的登录态（session）
        request.getSession().setAttribute(USER_LOGIN_STATE, safetyUser);

        return safetyUser;
    }


    /**
     * 用户登录实现类
     * @return UserLoginResult
     */
    @Override
    public User userLoginUserid(String userid, String password, HttpServletRequest request) {
        // 1. 基本校验
        if (!Boolean.TRUE.equals(checkLoginParams("loriyuhv", password))) {
            throw new BusinessException(ErrorCode.NULL_ERROR);
        }
        // 2. 校验密码是否输入正确，要和数据库中的密文密码去对比
        // 1）对密码进行加密
        String encryptPassword = DigestUtils.md5DigestAsHex((SALT + password).getBytes());
        // 2）查询用户编号是否存在
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userid", userid);        // 判断登录用户是否和数据库的用户相等
        queryWrapper.eq("password", encryptPassword);   // 判断登录密码（加密）是否和数据库的密码（加密）相等
        User user = userMapper.selectOne(queryWrapper);
        if (user == null) {
            log.info("user login failed! username cannot match password");
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 3. 返回用户信息（脱敏）
        User safetyUser = getSafetyUser(user);

        // 4. 记录用户的登录态（session）
        request.getSession().setAttribute(USER_LOGIN_STATE, safetyUser);

        return safetyUser;
    }

    /**
     * 用户登录校验
     */
    private Boolean checkLoginParams(String username, String password) {
        // 1. 校验用户账户和密码是否合法
        // 1）非空
        if (StringUtils.isAnyBlank(username, password)) {
            throw new BusinessException(ErrorCode.NULL_ERROR);
        }
        // 2） 账户的话不小于4位
        if (username.length() < 4) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 3） 密码不小于8位
        if (password.length() < 8) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 4） 账户不包含特殊字符
        String regEx="[`~!@#$%^&*()+=|{}':; ',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        Matcher matcher = Pattern.compile(regEx).matcher(username);
        if (matcher.find()) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        return true;
    }

    /**
     * 用户信息脱敏实现类
     * @param originUser 源user对象
     * @return 安全的user对象
     */
    @Override
    public User getSafetyUser(User originUser) {
        if (originUser == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        User safetyUser = new User();
        safetyUser.setId(originUser.getId());
        safetyUser.setUsername(originUser.getUsername());
        safetyUser.setUserid(originUser.getUserid());
        safetyUser.setName(originUser.getName());
        safetyUser.setGender(originUser.getGender());
        safetyUser.setAvatar(originUser.getAvatar());
        safetyUser.setEmail(originUser.getEmail());
        safetyUser.setSignature(originUser.getSignature());
        safetyUser.setTitle(originUser.getTitle());
        safetyUser.setUserGroup(originUser.getUserGroup());
        safetyUser.setCountry(originUser.getCountry());
        safetyUser.setAccess(originUser.getAccess());
        safetyUser.setProvince(originUser.getProvince());
        safetyUser.setCity(originUser.getCity());
        safetyUser.setAddress(originUser.getAddress());
        safetyUser.setPhone(originUser.getPhone());
        safetyUser.setUserStatus(originUser.getUserStatus());
        safetyUser.setUpdateTime(originUser.getUpdateTime());
        return safetyUser;
    }

    /**
     * 用户注销
     * @param request 请求体
     */
    @Override
    public int userOutLog(HttpServletRequest request) {
        // 移除登录态
        request.getSession().removeAttribute(USER_LOGIN_STATE);
        return 1;
    }

    /**
     * 用户注册实现类
     * @param userRegisterRequest 用户注册请求信息
     * @return 响应成功值
     */
    @Override
    public long userRegister(UserRegisterRequest userRegisterRequest) {
        String username = userRegisterRequest.getUsername();
        String userid = userRegisterRequest.getUserid();
        String password = userRegisterRequest.getCheckPassword();
        String checkPassword = userRegisterRequest.getCheckPassword();
        // 1. 校验
        if (StringUtils.isAnyBlank(username, userid, password, checkPassword)) {
            // todo 修改为自定义异常
            throw new BusinessException(ErrorCode.NULL_ERROR);
        }
        if (username.length() < 4) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        if (userid.length() > 5) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        if (password.length() < 8) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        if (checkPassword.length() < 8) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 账户不能包含特殊字符
        // 匹配所有特殊字符
        String regEx="[`~!@#$%^&*()+=|{}':; ',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        Matcher matcher = Pattern.compile(regEx).matcher(username);
        if (matcher.find()) {
            return -1;
        }

        // 密码和校验密码相同
        if (!password.equals(checkPassword)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        // 账户不能重复
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        long count = this.count(queryWrapper);
        if (count > 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        // 星球编号不能重复
        queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userid", userid);
        count = this.count(queryWrapper);
        if (count > 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 2. 对密码进行加密
        String encryptPassword = DigestUtils.md5DigestAsHex((SALT + password).getBytes());

        // 3. 插入数据
        User user = new User();
        user.setUsername(username);
        user.setPassword(encryptPassword);
        user.setUserid(userid);
        String avatar = "https://www.codefather.cn/logo.png";
        user.setAvatar(avatar);
        user.setName(username);
        boolean saveResult = this.save(user);
        System.out.println(saveResult);
        if (!saveResult) {
            throw new BusinessException(ErrorCode.SYSTEM_ERROR);
        }
        return user.getId();
    }
}




