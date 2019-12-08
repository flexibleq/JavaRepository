package com.fxq.homework.day01.subject04;

public class Animal {
    private int age;
    private int numOfLegs;

    public Animal() {
    }

    public Animal(int age, int numOfLegs) {
        this.age = age;
        this.numOfLegs = numOfLegs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }
    public void eat(int age,int num){
        System.out.println("吃东西");
    }
}
