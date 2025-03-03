package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.TOrder;
import generator.service.TOrderService;
import generator.mapper.TOrderMapper;
import org.springframework.stereotype.Service;

/**
* @author 东行
* @description 针对表【t_order(订单表)】的数据库操作Service实现
* @createDate 2025-03-03 20:31:47
*/
@Service
public class TOrderServiceImpl extends ServiceImpl<TOrderMapper, TOrder>
    implements TOrderService{

}




