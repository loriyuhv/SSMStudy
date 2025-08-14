package com.wsw.service;

import com.wsw.domain.Account;

import java.util.List;

/**
 * @author loriyuhv
 * @date 2025/8/14
 * @description account业务层
 */
public interface AccountService {
    Account selectById(int id);

    List<Account> selectAll();
}
