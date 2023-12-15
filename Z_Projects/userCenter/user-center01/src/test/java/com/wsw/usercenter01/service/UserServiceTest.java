package com.wsw.usercenter01.service;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.wsw.usercenter01.model.domain.User;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

@SpringBootTest
class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testDigest() throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("MD5");
        String string = DigestUtils.md5DigestAsHex(("tom" + "my_password").getBytes());
        System.out.println(string);
    }

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("Jerry");
        user.setUserAccount("loriyuhv");
        user.setAvatarUrl("http://localhost:8080");
        user.setGender(0);
        user.setUserPassword("0420");
        user.setPhone("18370508203");
        user.setEmail("2385933450@qq.com");
        boolean result = userService.save(user);
        System.out.println(user.getId());

        Assertions.assertTrue(result);
    }

    @Test
    public void testIsAnyBlank() {
        String str = "";
        String str02 = "1234";
        String str03 = "Alan";
        if (StringUtils.isAnyBlank(str, str02, str03)) {
            System.out.println("-1");
        }
    }

    @Test
    public void testSpecialCharacters() {
        // 账户不能包含特殊字符
        // String validPattern = "\\pP|\\pS|\\s+";
        // Matcher matcher = Pattern.compile(validPattern).matcher(userAccount);
        // boolean flag = matcher.find();
        // if (flag) {
        //     System.out.println(matcher.find());
        // }
        // String regEx="[`~!@#$%^&*()+=|{}':; ',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";

        // 匹配所有特殊字符
        String userAccount = "@Jerry";
        String regEx="[ @]";
        Matcher matcher = Pattern.compile(regEx).matcher(userAccount);
        System.out.println(matcher.find());
        if (matcher.find()) {                      // if这里判断是matcher.find()判断是true
            System.out.println(matcher.find());   //  println输出却是false
        }
    }

    @Test
    void userRegister() {
        // 1. 非空
        String userAccount = "Tom";
        String userPassword = "";
        String checkPassword = "123456";
        String plantCode = "0001";
        long result = userService.userRegister(userAccount, userPassword, checkPassword, plantCode);
        Assertions.assertEquals(-1, result);

        // 2. 账户的话不小于4位
        userAccount = "Tom";
        userPassword = "12345678";
        checkPassword = "12345678";
        plantCode = "0001";
        result = userService.userRegister(userAccount, userPassword, checkPassword, plantCode);
        Assertions.assertEquals(-1, result);

        // 3. 密码不小于8位
        userAccount = "Alan";
        userPassword = "123456";
        checkPassword = "123456";
        result = userService.userRegister(userAccount, userPassword, checkPassword, plantCode);
        Assertions.assertEquals(-1, result);

        // 4. 账户不包含特殊字符
        userAccount = "@Jerry";
        userPassword = "12345678";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword, plantCode);
        Assertions.assertEquals(-1, result);

        // 5. 密码和校验密码相同
        userPassword = "123456789";
        checkPassword = "123456788";
        result = userService.userRegister(userAccount, userPassword, checkPassword, plantCode);
        Assertions.assertEquals(-1, result);

        // 7. 账户不能重复
        userAccount = "Jerry";
        userPassword = "12345678";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword, plantCode);

        // 插入用户数据
        userAccount = "Marry";
        result = userService.userRegister(userAccount, userPassword, checkPassword, plantCode);
        Assertions.assertTrue(result > 0);
        System.out.println("success!!!");
    }
}