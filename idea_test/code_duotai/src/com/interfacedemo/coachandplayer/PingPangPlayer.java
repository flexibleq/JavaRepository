package com.interfacedemo.coachandplayer;

public class PingPangPlayer extends Player implements SpeakEnglish {

    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃牛肉");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学发球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("i can speak English");
    }
}
