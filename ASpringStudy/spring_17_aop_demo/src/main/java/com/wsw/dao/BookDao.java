package com.wsw.dao;

/**
 * @author loriyuhv
 * @date 2025/8/13
 * @description book表持久层接口
 */
public interface BookDao {
    void save();
    void update();
    void delete();
    void select();
}
