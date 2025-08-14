package com.wsw.service;

import com.wsw.config.SpringConfig;
import com.wsw.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void selectById() {
        Account account = accountService.selectById(1);
        System.out.println(account);
    }

    @Test
    public void selectAll() {
        List<Account> accounts = accountService.selectAll();
        System.out.println(accounts);
    }
}