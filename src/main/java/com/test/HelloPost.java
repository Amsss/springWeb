package com.test;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Author: Zezhao.Zhu
 * @Description:
 * @Create: 2018/5/10 9:21
 * @Modified By：
 */
public class HelloPost implements InitializingBean, BeanNameAware {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init() {
        System.out.println("调用自身的init方法");
    }

    public void destroy() {
        System.out.println("调用自身的destroy方法");
    }

    public void show() {
        System.out.println("hello world->" + message);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    @Override
    public void setBeanName(String s) {

    }
}
