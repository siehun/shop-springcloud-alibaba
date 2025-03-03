package generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 用户数据表
 * @TableName t_user
 */
@TableName(value ="t_user")
@Data
public class TUser implements Serializable {
    /**
     * 数据id
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 用户名
     */
    @TableField(value = "t_username")
    private String tUsername;

    /**
     * 密码
     */
    @TableField(value = "t_password")
    private String tPassword;

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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}