package com.example.springdemo.SpringEventPatterns.Event;

import org.springframework.context.ApplicationEvent;

import java.time.Clock;

/**
 * @author  pgystart
 * @create  2022-05-22  3:21 下午
 */
public class SpringUserRegisterSuccessEvent extends ApplicationEvent {
    //用户名
    private String userName;

    public SpringUserRegisterSuccessEvent(Object source, String userName) {
        super(source);
        this.userName=userName;
    }

    public SpringUserRegisterSuccessEvent(Object source, Clock clock) {
        super(source, clock);
    }
}
