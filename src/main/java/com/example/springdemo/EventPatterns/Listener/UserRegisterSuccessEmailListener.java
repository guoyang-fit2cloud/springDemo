package com.example.springdemo.EventPatterns.Listener;

import com.example.springdemo.EventPatterns.Event.UserRegisterSuccessEvent;
import org.springframework.stereotype.Component;

/**
 * @author  pgystart
 * @create  2022-05-22  2:40 下午
 */
@Component
public class UserRegisterSuccessEmailListener implements EventListener<UserRegisterSuccessEvent>{
    @Override
    public void onEvent(UserRegisterSuccessEvent event) {
        System.out.println(
                String.format(Thread.currentThread()+"给用户【%s】发送注册成功邮件!", event.getUserName()));
    }
}
