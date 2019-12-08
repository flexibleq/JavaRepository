package com.fxq.homework.day02.subject02;



public class Dog extends Animal implements Swimming {
    public Dog() {
    }

    public Dog(int age) {
        super(age);
    }

    @Override
    public void drinkWater() {
        System.out.println("喝水");
    }

    @Override
    public void eat() {
        System.out.println("啃骨头");
    }

    @Override
    public void swimming() {
        System.out.println("狗刨");
    }
}
