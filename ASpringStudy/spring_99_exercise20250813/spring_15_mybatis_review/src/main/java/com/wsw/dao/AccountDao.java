package com.wsw.dao;

import com.wsw.domain.Account;

import java.util.List;

/**
 * @author loriyuhv
 * @date 2025/8/13
 * @description 操作account表接口
 */
public interface AccountDao {
    List<Account> selectAll();
}
