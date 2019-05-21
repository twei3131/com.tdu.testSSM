package com.tdu.services;

import com.tdu.pojo.User;

public interface UserService
{
    public Boolean addUser(String username, String password) throws Exception;
}
