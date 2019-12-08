package com.fxq;

public class Dog extends Animal implements Jumpping {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void jump() {
        System.out.println("狗可以调高了");
    }
}
