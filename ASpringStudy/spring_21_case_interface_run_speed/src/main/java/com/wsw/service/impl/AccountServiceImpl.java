package com.wsw.service.impl;

import com.wsw.dao.AccountDao;
import com.wsw.domain.Account;
import com.wsw.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Account selectById(int id) {
        // System.out.println("account service select by " + id + " ...");
        return accountDao.selectById(id);
    }

    @Override
    public List<Account> selectAll() {
        return accountDao.selectAll();
    }
}
