package com.interfacedemo.classinterface;
/*
* 类与类之间是继承关系，单继承或者多层继承
* 类与接口之间是实现关系，可以单实现，也可以多实现
* 接口与接口之间时继承关系，可以单继承，也可以多继承
* 设计上的区别：
抽象类针对类抽象，包括属性，行为
* 接口针对行为抽象
*
*
* */
public class InterDemo {
    public static void main(String[] args) {
        Inter1 i = new InterImpl();
        i.eat();

        Inter2 ii = new InterImpl();
        ii.eat();

        Inter3 iii = new InterImpl();
        iii.eat();

        InterImpl iiii = (InterImpl)iii;
        iiii.eat();
    }

}
