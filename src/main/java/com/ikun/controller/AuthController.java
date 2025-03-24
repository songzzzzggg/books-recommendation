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
        //调用service中的服务
        //查询设计：现将传过来的password进行加密然后设置这个user对象的password字段为这个加密后的字段
        //然后设置一个接口，这个接口可以接受所有的条件
        //调用这个接口，如果获取不到说明为空，校验失败
        boolean result = authService.queryByCondition(user);
        if(result){
            return Result.ok("登录成功");
        }
        return Result.fail("登录失败");
    }




}
