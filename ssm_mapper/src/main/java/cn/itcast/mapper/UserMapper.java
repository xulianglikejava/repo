package cn.itcast.mapper;

import cn.itcast.User;

import java.util.List;

/**
 * @author xuLiang
 * @date 2019/10/16 19:15
 */
public interface UserMapper {
    List<User> findAll();
}
