package com.nageoffer.shortlink.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Date: 2024/7/17
 * Author: chenyuan
 * E-mail: yuan_chen24@163.com
 * Description:
 */
@SpringBootApplication
@MapperScan("com.nageoffer.shortlink.admin.dao.mapper")
public class ShortlinkAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShortlinkAdminApplication.class, args);
    }
}
