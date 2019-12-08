package com.interfacedemo.coachandplayer;

public class PingPangCoach extends Coach implements SpeakEnglish{

    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃牛肉");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教发球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("i can speak English");
    }
}
