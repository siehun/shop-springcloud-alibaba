package io.yue.shop.bean;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.math.BigDecimal;

import io.yue.shop.id.SnowFlakeFactory;
import lombok.Data;

/**
 * 商品数据表
 * @TableName t_product
 */
@TableName(value ="t_product")
@Data
public class Product implements Serializable {
    /**
     * 数据id
     */
    @TableId(value = "id", type = IdType.INPUT)
    @TableField(value = "id", fill = FieldFill.INSERT)
    private Long id;

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
     * 商品库存
     */
    @TableField(value = "t_pro_stock")
    private Integer proStock;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public Product() {
        this.id = SnowFlakeFactory.getSnowFlakeFromCache().nextId();
    }
}