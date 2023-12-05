package com.wsw;

import com.wsw.config.SpringConfig;
import com.wsw.domain.Account;
import com.wsw.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class APP {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService bean = context.getBean(AccountService.class);
        List<Account> all = bean.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }
}
