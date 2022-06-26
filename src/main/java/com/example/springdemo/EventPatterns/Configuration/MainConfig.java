package com.example.springdemo.EventPatterns.Configuration;

import com.example.springdemo.EventPatterns.Listener.EventListener;
import com.example.springdemo.EventPatterns.Multicaster.EventMulticaster;
import com.example.springdemo.EventPatterns.Multicaster.SimpleEventMulticaster;
import com.example.springdemo.EventPatterns.Service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * 下面有2个方法，负责向spring容器中注册2个bean
 * @1：向spring容器中注册了一个bean：事件发布者，方法传入了EventListener类型的List，这个地方会将容器中所有的事件监听器注入进来，丢到EventMulticaster中。
 *
 * @2：向spring容器中注册了一个bean：用户注册服务
 * @author  pgystart
 * @create  2022-05-22  2:27 下午
 */
@Configuration
@ComponentScan
public class MainConfig {

    /**
     * 注册一个bean：事件发布者
     *
     * @param eventListeners
     * @return
     */
    @Bean
    @Autowired(required = false)
    public EventMulticaster eventMulticaster(List<EventListener> eventListeners) { //@1
        EventMulticaster eventPublisher = new SimpleEventMulticaster();
        if (eventListeners != null) {
            eventListeners.forEach(eventPublisher::addEventListener);
        }
        return eventPublisher;
    }

    /**
     * 注册一个bean：用户注册服务
     * @param eventMulticaster
     * @return
     */
    @Bean
    public UserRegisterService userRegisterService(EventMulticaster eventMulticaster) { //@2
        UserRegisterService userRegisterService = new UserRegisterService();
        userRegisterService.setEventMulticaster(eventMulticaster);
        return userRegisterService;
    }
}
