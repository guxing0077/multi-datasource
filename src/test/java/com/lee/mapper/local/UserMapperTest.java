package com.lee.mapper.local;

import com.lee.base.BaseTest;
import com.lee.entity.local.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserMapperTest extends BaseTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void list() {
        List<User> users = userMapper.list();
    }
}