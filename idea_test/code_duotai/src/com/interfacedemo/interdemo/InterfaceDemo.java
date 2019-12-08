package com.interfacedemo.interdemo;
//接口不能直接实例化，只能通过实现类多态实例化
//多态：具体类多态，抽象类多态，接口多态
public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        i.show();
    }
}
