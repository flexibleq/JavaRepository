package com.fxq.classcode.day02.duotaidemo;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
