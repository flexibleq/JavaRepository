package com.fxq1;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void catchMouse(){
        System.out.println("猫能抓老鼠");
    }
}
