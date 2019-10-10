package com.distributed.database.service;


import com.distributed.database.entity.UserInfo;

/**
 * @ClassName UserInfoService
 * @Description TODO
 * @Auth Finley
 * @Date 2019/10/09 10:04
 * @Version 1.0
 **/
public interface UserInfoService {

    void addUser();

    UserInfo getUserById(Long userId);
}
