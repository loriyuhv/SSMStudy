package com.wsw.service;

import com.wsw.domain.Account;

import java.util.List;

/**
 * @author loriyuhv
 * @ClassName AccountService
 * @date 2024/4/12 5:15
 * @description TODO
 */

public interface AccountService {
    /**
     * @description 保存一条账户信息
     */
    void save(Account account);

    /**
     * @description 根据一个账户Id删除信息
     */

    void delete(Integer id);

    /**
     * @description 更新指定账户信息
     */
    void update(Account account);

    /**
     * @description 查询全部账户信息
     */
    List<Account> findAll();

    /**
     * @description 根据Id查询账户信息（一条）
     */
    Account findById(Integer id);
}
