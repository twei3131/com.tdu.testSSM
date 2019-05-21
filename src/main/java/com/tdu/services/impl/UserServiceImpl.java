package com.tdu.services.impl;

import com.tdu.mapper.UserMapper;
import com.tdu.pojo.User;
import com.tdu.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService
{
    @Autowired
    private UserMapper userMapper;

    public Boolean addUser(String username, String password) throws Exception
    {
        User user = new User();
        user.setNick(username);
        user.setName(username);
        user.setPassword(password);
        return userMapper.saveUser(user) == 1;
    }
}
