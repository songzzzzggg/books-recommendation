package com.ikun.common;

import org.springframework.util.DigestUtils;

/**
 * 密码加密工具类
 */
public class PasswordEncrypt {
    
    private static final String SALT = "ikun"; // 固定盐值
    
    /**
     * 密码加密
     * @param password 原始密码
     * @return 加密后的密码
     */
    public static String passwordEncypt(String password) {
        // 使用 MD5 进行加密，这样相同的密码会得到相同的结果
        return DigestUtils.md5DigestAsHex((password + SALT).getBytes());
    }
}
