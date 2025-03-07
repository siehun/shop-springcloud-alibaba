package io.yue.shop.product.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.yue.shop.bean.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductMapper extends BaseMapper<Product> {
    /**
     * 扣减商品库存
     * @return
     */
   int updateProductStockById(@Param("count") Integer count, @Param("id") Long id);
}
