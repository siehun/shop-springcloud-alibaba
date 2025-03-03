package io.yue.shop.bean;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.math.BigDecimal;

import io.yue.shop.id.SnowFlakeFactory;
import lombok.Data;

/**
 * 订单表
 * @TableName t_order
 */
@TableName(value ="t_order")
@Data
public class Order implements Serializable {
    /**
     * 数据id
     */
    @TableId(value = "id", type = IdType.INPUT)
    @TableField(value = "id", fill = FieldFill.INSERT)
    private Long id;

    /**
     * 用户id
     */
    @TableField(value = "t_user_id")
    private Long userId;

    /**
     * 用户名
     */
    @TableField(value = "t_user_name")
    private String userName;

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

    /**
     * 总价格
     */
    @TableField(value = "t_total_price")
    private BigDecimal totalPrice;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public Order() {
        this.id = SnowFlakeFactory.getSnowFlakeFromCache().nextId();
    }
}