package com.fxq1;

public class Zi extends Fu{
    public int age = 40;
    public void show(){
        int age = 30;
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);
    }
}
