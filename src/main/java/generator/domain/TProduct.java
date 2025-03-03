package generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 商品数据表
 * @TableName t_product
 */
@TableName(value ="t_product")
@Data
public class TProduct implements Serializable {
    /**
     * 数据id
     */
    @TableId(value = "id")
    private Long id;

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
     * 商品库存
     */
    @TableField(value = "t_pro_stock")
    private Integer tProStock;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}