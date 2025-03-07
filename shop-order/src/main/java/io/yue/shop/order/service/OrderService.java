package io.yue.shop.order.service;


import com.baomidou.mybatisplus.extension.service.IService;
import io.yue.shop.bean.Order;
import io.yue.shop.params.OrderParams;

public interface OrderService extends IService<Order> {
    /**
     * 保存订单
     */
    void saveOrder(OrderParams orderParams);
}
