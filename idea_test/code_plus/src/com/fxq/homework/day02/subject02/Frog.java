package com.fxq.homework.day02.subject02;

public class Frog extends Animal implements Swimming {
    public Frog() {
    }

    public Frog(int age) {
        super(age);
    }

    @Override
    public void drinkWater() {
        System.out.println("喝水");
    }

    @Override
    public void eat() {
        System.out.println("吃虫子");
    }

    @Override
    public void swimming() {
        System.out.println("蛙泳");
    }
}
