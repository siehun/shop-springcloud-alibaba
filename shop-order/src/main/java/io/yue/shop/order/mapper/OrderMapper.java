package io.yue.shop.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.yue.shop.bean.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}
