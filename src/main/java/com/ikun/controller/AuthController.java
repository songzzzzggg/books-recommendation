package com.ikun.controller;

import com.ikun.common.Result;
import com.ikun.entity.User;
import com.ikun.service.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2025/3/23 20:59
 * @Created by Song zuo gang
 */

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Resource
    AuthService authService;

    @PostMapping("/login")
    public Result<Boolean> login(@RequestBody User user){
        /**
         * 登录校验设计：根据传过来的user的userName去查询数据库，得到username对应的user对象。
         * 使用PasswordEncrypt.matches方法，将传过来的密码与从数据库获取到的密码进行对比。
         */
        boolean result = authService.queryByCondition(user);
        if(result){
            return Result.ok("登录成功");
        }
        return Result.fail("登录失败");
    }




}
