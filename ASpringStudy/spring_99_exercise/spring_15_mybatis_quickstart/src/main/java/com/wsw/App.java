package com.wsw;

import com.wsw.config.SpringConfig;
import com.wsw.domain.Account;
import com.wsw.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @author loriyuhv
 * @ClassName App
 * @date 2024/4/12 16:33
 * @description TODO
 */

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = context.getBean(AccountService.class);

        // Account account = new Account();
        // account.setId(2);
        // account.setName("Tom");
        // account.setMoney(3000.00);
        // accountService.save(account);

        // Account account = new Account();
        // account.setId(3);
        // account.setName("Edward");
        // account.setMoney(4000.00);
        // accountService.save(account);
        // accountService.update(account);

        accountService.delete(4);
        accountService.delete(5);

        List<Account> accounts = accountService.findAll();
        for (Account account1: accounts) {
            System.out.println(account1);
        }
    }
}
