package io.yue.shop.bean;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.math.BigDecimal;

import io.yue.shop.id.SnowFlakeFactory;
import lombok.Data;

/**
 * 订单条目表
 * @TableName t_order_item
 */
@TableName(value ="t_order_item")
@Data
public class OrderItem implements Serializable {
    /**
     * 数据id
     */
    @TableId(value = "id", type = IdType.INPUT)
    @TableField(value = "id", fill = FieldFill.INSERT)
    private Long id;

    /**
     * 订单id
     */
    @TableField(value = "t_order_id")
    private Long orderId;

    /**
     * 商品id
     */
    @TableField(value = "t_pro_id")
    private Long proId;

    /**
     * 商品名称
     */
    @TableField(value = "t_pro_name")
    private String proName;

    /**
     * 商品价格
     */
    @TableField(value = "t_pro_price")
    private BigDecimal proPrice;

    /**
     * 购买数量
     */
    @TableField(value = "t_number")
    private Integer number;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public OrderItem() {
        this.id = SnowFlakeFactory.getSnowFlakeFromCache().nextId();
    }
}