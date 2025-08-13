package com.wsw;

import com.wsw.config.SpringConfig;
import com.wsw.domain.Account;
import com.wsw.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author loriyuhv
 * @date 2025/8/13
 * @description 运行类
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = context.getBean(AccountService.class);
        List<Account> accounts = accountService.selectAll();
        accounts.forEach(System.out::println);
    }
}
