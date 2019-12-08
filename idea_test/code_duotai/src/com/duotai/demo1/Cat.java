package com.duotai.demo1;

public class Cat extends Animal{
    public int age;
    public int weight;

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void playGame(){
        System.out.println("猫玩捉迷藏");
    }
}
