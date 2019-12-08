package com.interfacedemo.catanddog;

public class Dog extends Animal implements Jumpping {

    public Dog(){}

    public Dog(String name,int age){
        super(name,age);
    }
    @Override
    public void jump() {
        System.out.println("狗可以跳高了");
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
