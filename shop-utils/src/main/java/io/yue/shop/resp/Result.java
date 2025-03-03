package io.yue.shop.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> implements Serializable {


    private static final long serialVersionUID = -9070313143572507108L;
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 状态描述
     */
    private String codeMsg;
    /**
     * 返回的数据
     */
    private T data;
}
