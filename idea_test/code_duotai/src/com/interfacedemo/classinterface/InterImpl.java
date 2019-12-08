package com.interfacedemo.classinterface;

public class InterImpl extends Object implements Inter1,Inter2,Inter3 {
    @Override
    public void eat() {
        System.out.println("吃东西");
    }
}
