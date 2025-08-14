package com.wsw.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author loriyuhv
 * @date 2025/8/14
 * @description account业务层接口
 */
public interface AccountService {
    /**
     * 转账操作
     * @param out 传出方
     * @param in 转入放
     * @param money 金额
     */
    // 步骤一：在业务层接口上添加Spring事务管理
    @Transactional
    void transfer(String out, String in, Double money);
}
