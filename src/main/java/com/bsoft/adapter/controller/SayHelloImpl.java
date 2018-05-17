package com.bsoft.adapter.controller;


public class SayHelloImpl implements SayHello {

    public SayHelloImpl() {
        System.out.println("我被实例化了");
    }

    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}