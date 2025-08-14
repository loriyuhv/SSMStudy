package com.wsw.dao;

import com.wsw.domain.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author loriyuhv
 * @date 2025/8/14
 * @description account数据表持久层
 */
public interface AccountDao {
    @Select("SELECT * FROM tb_account WHERE id = #{id};")
    Account selectById(int id);

    @Select("SELECT * FROM tb_account;")
    List<Account> selectAll();
}
