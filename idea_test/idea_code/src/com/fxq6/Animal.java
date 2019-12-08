package com.fxq6;
/*
* 抽象类
* */
public abstract class Animal {

    private int age = 20;
    private final String city = "北京";

    public Animal(){}
    public void show(){
        age = 40;
        System.out.println(age);
        System.out.println(city);
    }

    public abstract void eat();

    public void sleep(){
        System.out.println("睡觉");
    }

}
