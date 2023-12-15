package com.wsw;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

@SpringBootTest
class UserCenterBackApplicationTests {

	@Test
	void contextLoads() {
		String SALT = "Jerry";
		String password = "12345678";
		String encryptPassword = DigestUtils.md5DigestAsHex((SALT + password).getBytes());
		System.out.println(encryptPassword);
	}

}
