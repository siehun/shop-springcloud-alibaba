package io.yue.shop.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.yue.shop.bean.User;

public interface UserService extends IService<User> {
    /**
     * 根据id获取用户信息
     * @param userId
     * @return
     */
    User getUserById(Long userId);
}
