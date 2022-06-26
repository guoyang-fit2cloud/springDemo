package com.example.springdemo.EventPatterns.Listener;
import com.example.springdemo.EventPatterns.Event.AbstractEvent;
/**
 * 事件监听器(我们使用一个接口来表示事件监听器，是个泛型接口，后面的类型E表示当前监听器需要监听的事件类型，此接口中只有一个方法，用来实现处理事件的业务；其定义的监听器需要实现这个接口。)
 * @param <E> 当前监听器感兴趣的事件类型
 * @author  pgystart
 * @create  2022-05-22  2:21 下午
 */
public interface EventListener<E extends AbstractEvent> {
    /**
     * 此方法负责处理事件
     *
     * @param event 要响应的事件对象
     */
    void onEvent(E event);
}
