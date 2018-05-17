package com.test3;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * @Author: Zezhao.Zhu
 * @Description:
 * @Create: 2018/5/10 11:52
 * @Modified By：
 */
public class StartListener implements ApplicationListener<ContextStartedEvent> {

    @Override
    public void onApplicationEvent(ContextStartedEvent arg0) {
        System.out.println("application starting...");
    }

}

