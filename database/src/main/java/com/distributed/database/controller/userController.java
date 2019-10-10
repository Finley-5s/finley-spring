package com.distributed.database.controller;

import com.alibaba.fastjson.JSON;
import com.distributed.database.entity.UserInfo;
import com.distributed.database.mapper.UserInfoMapper;
import com.distributed.database.service.impl.UserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName userController
 * @Description TODO
 * @Auth Finley
 * @Date 2019/10/09 10:02
 * @Version 1.0
 **/
@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Autowired
    UserInfoServiceImpl userInfoService;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(){
        userInfoService.addUser();
        return "success";
    }

    @RequestMapping(value = "/getUserById/{userId}", method = RequestMethod.GET)
    public String getUserById(@PathVariable Long userId){
        UserInfo userinfo = userInfoService.getUserById(userId);
        return JSON.toJSON(userinfo).toString();
    }
}
