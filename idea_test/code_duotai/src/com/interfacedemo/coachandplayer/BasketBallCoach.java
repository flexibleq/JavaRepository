package com.interfacedemo.coachandplayer;

public class BasketBallCoach extends Coach {

    public BasketBallCoach() {
    }

    public BasketBallCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃羊肉");
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教运球");
    }
}
