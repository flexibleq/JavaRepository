package com.fxq.homework.day01.subject04;

public class Tiger extends Animal{
    public Tiger() {
    }

    public Tiger(int age, int numOfLegs) {
        super(age, numOfLegs);
    }

    @Override
    public void eat(int age,int num) {
        System.out.println("年龄为"+age+"的"+num+"条腿的老虎在吃羊");
    }
}
