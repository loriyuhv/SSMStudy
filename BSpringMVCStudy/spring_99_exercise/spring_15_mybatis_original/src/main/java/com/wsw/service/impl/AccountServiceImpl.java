package com.wsw.service.impl;

import com.wsw.dao.AccountDao;
import com.wsw.domain.Account;
import com.wsw.service.AccountService;

import java.util.List;

/**
 * @author loriyuhv
 * @ClassName AccountServiceImpl
 * @date 2024/4/12 5:18
 * @description TODO
 */

public class AccountServiceImpl implements AccountService {

    private final AccountDao accountDao;

    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void save(Account account) {
        accountDao.save(account);
    }

    @Override
    public void delete(Integer id) {
        accountDao.delete(id);
    }

    @Override
    public void update(Account account) {
        accountDao.update(account);
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public Account findById(Integer id) {
        return accountDao.findById(id);
    }
}
