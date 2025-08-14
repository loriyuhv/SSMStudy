package com.wsw.service.impl;

import com.wsw.dao.AccountDao;
import com.wsw.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * @author loriyuhv
 * @date 2025/8/14
 * @description AccountService接口实现类
 */
@Service
public class AccountServiceImpl implements AccountService {
    private final AccountDao accountDao;

    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out, money);
        int i = 10 / 0;
        accountDao.inMoney(in, money);
    }
}
