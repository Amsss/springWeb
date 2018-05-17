package com.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @Author: Zezhao.Zhu
 * @Description:
 * @Create: 2018/5/10 10:34
 * @Modified By：
 */
public class FactoryPost implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
            throws BeansException {

        System.out.println("对容器进行处理");
    }

}
