package com.wsw.model.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户表
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 账号
     */
    private String username;

    /**
     * 编号
     */
    private String userid;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String name;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 签名
     */
    private String signature;

    /**
     * 邻域
     */
    private String title;

    /**
     * 部门
     */
    private String userGroup;

    /**
     * 城市
     */
    private String country;

    /**
     * 角色（user：用户 admin：管理员）
     */
    private String access;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 电话
     */
    private String phone;

    /**
     * 状态（0：正常 1：注销）
     */
    private Integer userStatus;

    /**
     * 是否删除（0：否 1：是）
     */
    @TableLogic
    private Integer userDelete;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}