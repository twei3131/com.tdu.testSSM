package com.tdu.mapper;

import com.tdu.pojo.User;

public interface UserMapper
{
    public Integer saveUser(User user) throws Exception;

    public User getUserById(String id) throws  Exception;
}
