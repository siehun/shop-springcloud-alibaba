package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.TUser;
import generator.service.TUserService;
import generator.mapper.TUserMapper;
import org.springframework.stereotype.Service;

/**
* @author 东行
* @description 针对表【t_user(用户数据表)】的数据库操作Service实现
* @createDate 2025-03-03 20:32:30
*/
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser>
    implements TUserService{

}




