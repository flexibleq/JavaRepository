package com.fxq.day07.subject02;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone("小米",998);
        p.call();
        p.sendMessage();
        p.playGame();

        Phone p1 = new Phone();
        p1.setBrand("小米");
        p1.setPrice(998);
        p1.call();
        p1.sendMessage();
        p1.playGame();
    }
}
