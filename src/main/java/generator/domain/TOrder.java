package generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 订单表
 * @TableName t_order
 */
@TableName(value ="t_order")
@Data
public class TOrder implements Serializable {
    /**
     * 数据id
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 用户id
     */
    @TableField(value = "t_user_id")
    private Long tUserId;

    /**
     * 用户名
     */
    @TableField(value = "t_user_name")
    private String tUserName;

    /**
     * 手机号
     */
    @TableField(value = "t_phone")
    private String tPhone;

    /**
     * 地址
     */
    @TableField(value = "t_address")
    private String tAddress;

    /**
     * 总价格
     */
    @TableField(value = "t_total_price")
    private BigDecimal tTotalPrice;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}