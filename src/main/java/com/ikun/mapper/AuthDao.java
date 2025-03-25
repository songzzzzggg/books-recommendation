package com.ikun.mapper;

import com.ikun.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Classname AuthDao
 * @Description TODO
 * @Date 2025/3/23 21:09
 * @Created by Song zuo gang
 */
@Mapper
public interface AuthDao {

    int queryByCondition(User user);


    User queryByUserName(String userName);
}
