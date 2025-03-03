package generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 订单条目表
 * @TableName t_order_item
 */
@TableName(value ="t_order_item")
@Data
public class TOrderItem implements Serializable {
    /**
     * 数据id
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 订单id
     */
    @TableField(value = "t_order_id")
    private Long tOrderId;

    /**
     * 商品id
     */
    @TableField(value = "t_pro_id")
    private Long tProId;

    /**
     * 商品名称
     */
    @TableField(value = "t_pro_name")
    private String tProName;

    /**
     * 商品价格
     */
    @TableField(value = "t_pro_price")
    private BigDecimal tProPrice;

    /**
     * 购买数量
     */
    @TableField(value = "t_number")
    private Integer tNumber;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}