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
        //将password进行加密处理
        String encryptedPassword = PasswordEncrypt.passwordEncypt(user.getPassword());
        user.setPassword(encryptedPassword);
        //去数据库中比对
        int count = authDao.queryByCondition(user);
        return count>0;
    }
}
