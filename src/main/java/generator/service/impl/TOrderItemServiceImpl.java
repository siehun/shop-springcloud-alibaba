package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.TOrderItem;
import generator.service.TOrderItemService;
import generator.mapper.TOrderItemMapper;
import org.springframework.stereotype.Service;

/**
* @author 东行
* @description 针对表【t_order_item(订单条目表)】的数据库操作Service实现
* @createDate 2025-03-03 20:32:03
*/
@Service
public class TOrderItemServiceImpl extends ServiceImpl<TOrderItemMapper, TOrderItem>
    implements TOrderItemService{

}




