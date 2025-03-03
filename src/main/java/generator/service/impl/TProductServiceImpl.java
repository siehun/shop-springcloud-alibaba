package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.TProduct;
import generator.service.TProductService;
import generator.mapper.TProductMapper;
import org.springframework.stereotype.Service;

/**
* @author 东行
* @description 针对表【t_product(商品数据表)】的数据库操作Service实现
* @createDate 2025-03-03 20:32:24
*/
@Service
public class TProductServiceImpl extends ServiceImpl<TProductMapper, TProduct>
    implements TProductService{

}




