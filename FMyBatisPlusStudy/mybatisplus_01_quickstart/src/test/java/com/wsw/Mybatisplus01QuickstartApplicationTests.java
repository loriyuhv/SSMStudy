package com.wsw;

import com.wsw.dao.UserDao;
import com.wsw.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatisplus01QuickstartApplicationTests {

	@Autowired
	private UserDao userDao;

	@Test
	void contextLoads() {
		User user = userDao.getById(1);
		System.out.println(user);
	}

	@Test
	void testGetAll() {
		List<User> users = userDao.selectList(null);
		for (User user : users) {
			System.out.println(user);
		}
	}

}
