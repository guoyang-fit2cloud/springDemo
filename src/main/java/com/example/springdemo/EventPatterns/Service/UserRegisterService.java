package com.example.springdemo.EventPatterns.Service;

import com.example.springdemo.EventPatterns.Event.UserRegisterSuccessEvent;
import com.example.springdemo.EventPatterns.Multicaster.EventMulticaster;
import com.example.springdemo.SpringEventPatterns.Event.SpringUserRegisterSuccessEvent;
import org.springframework.context.event.ApplicationEventMulticaster;

import javax.annotation.Resource;

/**
 * 用户注册服务
 */
public class UserRegisterService {
    //事件发布者
    private EventMulticaster eventMulticaster; //@0
    @Resource
    private ApplicationEventMulticaster applicationEventMulticaster;

    /**
     * 注册用户
     *
     * @param userName 用户名
     */
    public void registerUser(String userName) { //@1
        //用户注册(将用户信息入库等操作)
        System.out.println(String.format("用户【%s】注册成功", userName)); //@2
        //广播事件
        this.eventMulticaster.multicastEvent(new UserRegisterSuccessEvent(this, userName)); //@3
        //Spring的广播事件
        this.applicationEventMulticaster.multicastEvent(new SpringUserRegisterSuccessEvent(this, userName));
    }

    public EventMulticaster getEventMulticaster() {
        return eventMulticaster;
    }

    public void setEventMulticaster(EventMulticaster eventMulticaster) {
        this.eventMulticaster = eventMulticaster;
    }
}
