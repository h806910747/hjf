package com.bianyi.service;

import com.bianyi.pojo.User;

public interface UserService {
    User findUserByUsername(String username);
}
