package com.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

/**
 * @Author: Zezhao.Zhu
 * @Description:
 * @Create: 2018/5/10 9:21
 * @Modified By：
 */
public class HelloHander implements BeanPostProcessor, Ordered {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {

        System.out.println("正在调用postProcessAfterInit->" + beanName);
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {

        System.out.println("正在调用postProcessBeforeInit->" + beanName);
        return bean;
    }

    @Override
    public int getOrder() {
        // TODO Auto-generated method stub
        return 1;
    }
}
