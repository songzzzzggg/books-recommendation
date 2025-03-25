package com.ikun.common;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
/**
 * 密码加密工具类
 */
public class PasswordEncrypt {

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    
    /**
     * 密码加密
     * @param rawPassword 原始密码
     * @return 加密后的密码
     */
    public static String passwordEncypt(String rawPassword) {
        return encoder.encode(rawPassword); // 生成加密后的密码
    }

    public static boolean matches(String rawPassword, String encodedPassword) {
        return encoder.matches(rawPassword, encodedPassword); // 校验密码
    }

    public static void main(String[] args) {
        System.out.println(encoder.encode("12345"));
    }

}
