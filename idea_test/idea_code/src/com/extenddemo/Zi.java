package com.extenddemo;

public class Zi extends Fu{
    public int age = 30;
    public void method(){
        System.out.println("method方法被调用");
        System.out.println(this.age);
        System.out.println(super.age);
    }
}
