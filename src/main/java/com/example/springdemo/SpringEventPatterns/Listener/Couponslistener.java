package com.example.springdemo.SpringEventPatterns.Listener;

import com.example.springdemo.SpringEventPatterns.Event.SpringUserRegisterSuccessEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author  pgystart
 * @create  2022-05-22  3:23 下午
 */
@Component
public class Couponslistener {
    @EventListener
    public void onApplicationEvent(SpringUserRegisterSuccessEvent event) {
        System.out.println(Thread.currentThread()+"进入Spring的监听器,发放优惠券!");
    }
}
