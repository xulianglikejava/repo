package cn.itcast.controller;

import cn.itcast.User;

import cn.itcast.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author z_sir
 * @date 2019-10-11
 */
@Controller
@RequestMapping("/city")
public class CityController {
    @Reference//注册中心中搜索已有的服务提供方
    private UserService cityService;
    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll()throws Exception{
        return cityService.findAll();
    }
}
