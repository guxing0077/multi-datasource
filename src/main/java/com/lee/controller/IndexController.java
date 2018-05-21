package com.lee.controller;

import com.lee.entity.local.User;
import com.lee.service.local.UserService;
import com.lee.service.tecent.TUserService;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private TUserService tecentUserService;

    @Autowired
    private UserService localUserService;

    @GetMapping("list")
    public String list(){
        List<com.lee.entity.tecent.User> tecentUsers = tecentUserService.list();
        List<User> localUsers = localUserService.list();
        return "success";
    }

    @GetMapping("health")
    public JsonRes index(){
        JsonRes jsonRes = new JsonRes();
        jsonRes.setCode(200);
        jsonRes.setData(true);
        jsonRes.setMsg("mac");
        return jsonRes;
    }

    @Data
    private class JsonRes {
        private int code;
        private String msg;
        private Object data;
    }
}
