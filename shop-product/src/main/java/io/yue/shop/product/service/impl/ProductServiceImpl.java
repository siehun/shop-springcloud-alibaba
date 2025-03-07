package io.yue.shop.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.yue.shop.bean.Product;
import io.yue.shop.product.mapper.ProductMapper;
import io.yue.shop.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Product getProductById(Long pid) {
        return productMapper.selectById(pid);
    }

    @Override
    public int updateProducctStockById(Integer count, Long id) {
        return productMapper.updateProductStockById(count ,id);
    }
}
