package com.ikun.service.impl;

//import com.ikun.common.PasswordEncrypt;
//import com.ikun.common.PasswordEncrypt;
import com.ikun.common.PasswordEncrypt;
import com.ikun.entity.User;
import com.ikun.mapper.AuthDao;
import com.ikun.service.AuthService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Classname AuthServiceImpl
 * @Description TODO
 * @Date 2025/3/23 21:06
 * @Created by Song zuo gang
 */
@Service("AuthService")
public class AuthServiceImpl implements AuthService {

    @Resource
    AuthDao authDao;
    @Override
    public boolean queryByCondition(User user) {
        //根据用户名去数据库查询对应的user对象
        String userName = user.getUserName();
        User dbUser = authDao.queryByUserName(userName);
        if(dbUser ==null || !PasswordEncrypt.matches(user.getPassword(),dbUser.getPassword())){
            return false;
        }
        return true;
    }
}
