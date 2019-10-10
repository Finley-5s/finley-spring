package com.distributed.database.service.impl;

import com.distributed.database.entity.UserInfo;
import com.distributed.database.mapper.UserInfoMapper;
import com.distributed.database.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserInfoServiceImpl
 * @Description TODO
 * @Auth Finley
 * @Date 2019/10/09 10:10
 * @Version 1.0
 **/
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    public static Long userId = 100L;

    @Override
    public void addUser() {
        for(int i=1; i<100; i++){
            UserInfo userinfo = new UserInfo();
            userinfo.setUserId(i);
            userinfo.setAccount("Account"+i);
            userinfo.setUserName("UserName"+i);
            userinfo.setPassword("Password"+i);

            userInfoMapper.addUser(userinfo);
        }
    }

    @Override
    public UserInfo getUserById(Long userId) {
        return userInfoMapper.getUserById(userId);
    }
}
