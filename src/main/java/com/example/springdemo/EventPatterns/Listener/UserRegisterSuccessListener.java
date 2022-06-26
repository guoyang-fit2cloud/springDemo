package com.example.springdemo.EventPatterns.Listener;

import com.example.springdemo.EventPatterns.Event.UserRegisterSuccessEvent;
import org.springframework.stereotype.Component;

/**
 * @author  pgystart
 * @create  2022-05-22  2:38 下午
 */
@Component
public class UserRegisterSuccessListener implements EventListener<UserRegisterSuccessEvent>{

    @Override
    public void onEvent(UserRegisterSuccessEvent event) {
        System.out.println(
                String.format(Thread.currentThread()+"给用户【%s】发送优惠券!", event.getUserName()));
    }
}
