package com.wsw.dao;

import org.apache.ibatis.annotations.Insert;

/**
 * @author loriyuhv
 * @date 2025/8/14
 * @description log表持久层接口
 */
public interface LogDao {
    @Insert("INSERT INTO tb_log (info, createDate) VALUES (#{info}, now());")
    void log(String info);
}
