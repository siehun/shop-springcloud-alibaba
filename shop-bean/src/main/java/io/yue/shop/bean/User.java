package io.yue.shop.bean;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;

import io.yue.shop.id.SnowFlakeFactory;
import io.yue.shop.psswd.PasswordUtils;
import lombok.Data;

/**
 * 用户数据表
 * @TableName t_user
 */
@TableName(value ="t_user")
@Data
public class User implements Serializable {
    /**
     * 数据id
     */
    @TableId(value = "id", type = IdType.INPUT)
    @TableField(value = "id", fill = FieldFill.INSERT)
    private Long id;

    /**
     * 用户名
     */
    @TableField(value = "t_username")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "t_password")
    private String password;

    /**
     * 手机号
     */
    @TableField(value = "t_phone")
    private String phone;

    /**
     * 地址
     */
    @TableField(value = "t_address")
    private String address;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public User() {
        this.id = SnowFlakeFactory.getSnowFlakeFromCache().nextId();
        this.password = PasswordUtils.getPassword("123456");
    }
}