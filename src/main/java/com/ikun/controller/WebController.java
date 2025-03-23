package com.ikun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname WebController
 * @Date 2025/3/23 19:08
 * @Created by Song zuo gang
 */
@RestController
public class WebController {

    @GetMapping("/hello")
    public String test(){
        return "hello";
    }


}
