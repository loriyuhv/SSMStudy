package com.wsw;

import com.wsw.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot08MybatisApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private UserDao userDao;
	@Test
	void testGetById() {
		User user = userDao.getById(1);
		System.out.println(user);
	}

}
