package com.example.springdemo.EventPatterns.Event;

/**
 * @author  pgystart
 * @create  2022-05-22  2:20 下午
 */
/**
 * 事件对象
 */
public abstract class AbstractEvent {

    //事件源
    protected Object source;

    public AbstractEvent(Object source) {
        this.source = source;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }
}
