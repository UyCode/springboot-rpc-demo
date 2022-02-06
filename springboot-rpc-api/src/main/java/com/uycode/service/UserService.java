package com.uycode.service;

import com.uycode.model.User;

import java.util.List;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2022/2/6
 */

public interface UserService {

    List<User> findUsers();

    String sayHi(String message);
}
