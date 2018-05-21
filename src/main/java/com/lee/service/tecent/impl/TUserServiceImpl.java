package com.lee.service.tecent.impl;

import com.lee.entity.tecent.User;
import com.lee.mapper.tecent.TUserMapper;
import com.lee.mapper.tecent.TUserMapper;
import com.lee.service.tecent.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TUserServiceImpl implements TUserService {

    @Autowired
    private TUserMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.list();
    }
}
