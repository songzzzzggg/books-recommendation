package com.ikun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname TestController
 * @Description TODO
 * @Date 2025/3/23 22:31
 * @Created by Song zuo gang
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }


}
