package com.interfacedemo.coachandplayer;

public class BasketBallPlayer extends Player {

    public BasketBallPlayer() {
    }

    public BasketBallPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学运球");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃羊肉");
    }
}
