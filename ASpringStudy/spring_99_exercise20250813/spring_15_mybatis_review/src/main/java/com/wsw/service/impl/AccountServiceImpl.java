package com.wsw.service.impl;

import com.wsw.dao.AccountDao;
import com.wsw.domain.Account;
import com.wsw.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author loriyuhv
 * @date 2025/8/13
 * @description AccountService接口实现类
 */

@Service
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;
    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
    @Override
    public List<Account> selectAll() {
        return accountDao.selectAll();
    }
}
