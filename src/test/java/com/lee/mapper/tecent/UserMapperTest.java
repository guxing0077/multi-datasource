package com.lee.mapper.tecent;

import com.lee.base.BaseTest;
import com.lee.entity.tecent.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserMapperTest extends BaseTest {

    @Autowired
    private TUserMapper localUserMapper;

    @Test
    public void list() {
        List<User> users = localUserMapper.list();
    }
}