package com.fxq.homework.day02.subject02;

public class Sheep extends Animal {
    public Sheep() {
    }

    public Sheep(int age) {
        super(age);
    }

    @Override
    public void drinkWater() {
        System.out.println("喝水");
    }

    @Override
    public void eat() {
        System.out.println("羊啃草");
    }
}
