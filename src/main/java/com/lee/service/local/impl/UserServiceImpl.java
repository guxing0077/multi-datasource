package com.lee.service.local.impl;

import com.lee.entity.local.User;
import com.lee.mapper.local.UserMapper;
import com.lee.service.local.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper tUserMapper;

    @Override
    public List<User> list() {
        return tUserMapper.list();
    }
}
