package cn.itcast.service.impl;

import cn.itcast.User;
import cn.itcast.mapper.UserMapper;
import cn.itcast.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

/**
 * @author xuLiang
 * @date 2019/10/16 19:42
 */
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        List<User> userList = userMapper.findAll();
        return userList;
    }
}
