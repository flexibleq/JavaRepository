package com.interfacedemo.interdemo;

public interface Inter {
//    public int age;接口中没有成员变量，只有常量,默认修饰符为public static final
    public static final int age = 20;

//    public void show(){}接口中只有抽象方法，默认修饰符为public abstract
    public abstract void show();
}
