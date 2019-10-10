package com.distributed.database.mapper;

import com.distributed.database.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName UserInfoMapper
 * @Description TODO
 * @Auth Finley
 * @Date 2019/10/09 10:03
 * @Version 1.0
 **/
@Mapper
public interface UserInfoMapper {
    
    int addUser(UserInfo userinfo);

    UserInfo getUserById(Long userId);
}
