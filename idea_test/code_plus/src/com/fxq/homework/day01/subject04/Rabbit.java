package com.fxq.homework.day01.subject04;

public class Rabbit extends Animal{
    public Rabbit() {
    }

    public Rabbit(int age, int numOfLegs) {
        super(age, numOfLegs);
    }

    @Override
    public void eat(int age, int num) {
        System.out.println("年龄为"+age+"的"+num+"条腿的兔子在吃狗尾草");
    }
}
