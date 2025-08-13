package com.wsw.service;

import com.wsw.domain.Account;

import java.util.List;

/**
 * @author loriyuhv
 * @date 2025/8/13
 * @description 账户业务层接口
 */
public interface AccountService {
    List<Account> selectAll();
}
