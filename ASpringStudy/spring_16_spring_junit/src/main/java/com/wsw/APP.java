package com.wsw;

import com.wsw.config.SpringConfig;
import com.wsw.domain.Account;
import com.wsw.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class APP {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService bean = context.getBean(AccountService.class);
        Account byId = bean.findById(1);
        System.out.println(byId);
    }
}
