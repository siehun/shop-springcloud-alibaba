package io.yue.shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.yue.shop.ProductStarter;
import io.yue.shop.bean.Product;

public interface ProductService extends IService<Product> {

    /**
     * 根据id获取商品信息
     */
    Product getProductById(Long pid);

    /**
     * 扣减商品库存
     */
    int updateProducctStockById(Integer count, Long id);
}
