package com.wsw;

import com.wsw.domain.User;
import com.wsw.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class AMyBatisXPluginsUseApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("hello world");
	}

	@Autowired
	private UserMapper userMapper;
	@Test
	void testGetAll() {
		List<User> users = userMapper.selectList(null);
		System.out.println(users);
	}

}
