package io.yue.shop.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.yue.shop.bean.OrderItem;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单条目
 */
@Mapper
public interface OrderItemMapper extends BaseMapper<OrderItem> {
}
