package com.uycode.provider.srevice.impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.uycode.model.User;
import com.uycode.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2022/2/6
 */
@Component
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
    @Override
    public List<User> findUsers() {
        List<User> users = new ArrayList<>();

        users.add(new User(1, "ahmatjan1", 27));
        users.add(new User(2, "ahmatjan2", 28));
        users.add(new User(3, "ahmatjan3", 29));
        return users;
    }

    @Override
    public String sayHi(String message) {
        return "Hi " + message + ", Welcome to rpc demo";
    }
}
