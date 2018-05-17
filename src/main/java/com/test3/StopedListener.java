package com.test3;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * @Author: Zezhao.Zhu
 * @Description:
 * @Create: 2018/5/10 11:53
 * @Modified By：
 */
public class StopedListener implements ApplicationListener<ContextStoppedEvent> {

    @Override
    public void onApplicationEvent(ContextStoppedEvent arg0) {
        System.out.println("context stopped..");
    }

}
