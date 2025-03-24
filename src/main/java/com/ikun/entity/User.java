package com.ikun.entity;

import lombok.Data;

/**
 * @Classname User
 * @Description TODO
 * @Date 2025/3/23 21:03
 * @Created by Song zuo gang
 */
@Data
public class User {


    private int id;
    private String userName;
    private String email;
    private String password;
    private String avatar;
    private String role;
    private int status;



}
