package com.fxq.classcode.day02.duotaidemo;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
