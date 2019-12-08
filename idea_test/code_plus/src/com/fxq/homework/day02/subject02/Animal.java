package com.fxq.homework.day02.subject02;

public abstract class Animal {
    private int age;

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void drinkWater();

    public abstract void eat();
}
