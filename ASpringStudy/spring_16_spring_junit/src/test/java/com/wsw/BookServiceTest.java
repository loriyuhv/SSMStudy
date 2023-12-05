package com.wsw;

import com.wsw.config.SpringConfig;
import com.wsw.domain.Account;
import com.wsw.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//设置类运行器
@RunWith(SpringJUnit4ClassRunner.class)
//设置Spring环境对应的配置类
@SpringJUnitConfig(classes = {SpringConfig.class})
//@ContextConfiguration(locations={"classpath:applicationContext.xml"})//加载配置文件
public class BookServiceTest {

    //支持自动装配注入bean
    @Autowired
    private AccountService accountService;
    @Test
    public void testFindAll() {
        Account account = accountService.findById(1);
        System.out.println(account);
    }
}
