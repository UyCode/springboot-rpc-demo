package com.uycode.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.uycode.model.User;
import com.uycode.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2022/2/6
 */
@RestController
public class UserController {

    //此处如果注明版本version,一直会报错,去掉了就没有报错
    @Reference(url="dubbo://127.0.0.1:20880")
    private UserService userService;

    @RequestMapping("/hello")
    public Object sayHi(String name){
        return userService.sayHi("cpx");
    }

    @RequestMapping("/findUsers")
    public List<User> findUsers(){
        return userService.findUsers();
    }

}
