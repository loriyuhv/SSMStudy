package com.wsw.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author loriyuhv
 * @date 2025/8/14
 * @description account数据表持久层接口
 */
public interface AccountDao {
    @Update("UPDATE tb_account SET money = money + #{money} WHERE name = #{name};")
    void inMoney(@Param("name") String name, @Param("money") Double money);

    @Update("UPDATE tb_account SET money = money - #{money} WHERE name = #{name};")
    void outMoney(@Param("name") String name, @Param("money") Double money);
}
