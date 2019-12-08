package com.fxq1;

public class PingPangPlayer extends Player implements SpeakEnglish{

    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃大白菜，喝小米粥");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习发球和接球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
}
