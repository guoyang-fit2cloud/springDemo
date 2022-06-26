package com.example.springdemo;

import com.example.springdemo.EventPatterns.Configuration.MainConfig;
import com.example.springdemo.EventPatterns.Service.UserRegisterService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.Resource;

@SpringBootTest
class SpringDemoApplicationTests {
    @Resource
    private UserRegisterService userRegisterService;
    @Test
    public void test() {
        //模拟用户注册
        userRegisterService.registerUser("路人甲Java");
    }

}
