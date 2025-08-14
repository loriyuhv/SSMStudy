package com.wsw.service.impl;

import com.wsw.config.SpringConfig;
import com.wsw.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceImplTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void transfer() throws IOException {
        // accountService.transfer("Tom", "Jerry", 1000.0);
        accountService.transfer("Jerry", "Tom", 1000.0);
    }
}