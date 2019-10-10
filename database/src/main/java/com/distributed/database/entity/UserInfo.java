package com.distributed.database.entity;

import lombok.Data;

/**
 * @ClassName Userinfo
 * @Description TODO
 * @Auth Finley
 * @Date 2019/10/09 10:08
 * @Version 1.0
 **/
@Data
public class UserInfo {

    private int userId;

    private String userName;

    private String account;

    private String password;
}
