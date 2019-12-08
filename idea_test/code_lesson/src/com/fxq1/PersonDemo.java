package com.fxq1;

public class PersonDemo {
    public static void main(String[] args) {
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("王皓");
        ppp.setAge(30);
        System.out.println(ppp.getName()+","+ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speak();
        System.out.println("--------------------------");

        BasketBallPlayer bbp = new BasketBallPlayer();
        bbp.setName("姚明");
        bbp.setAge(35);
        System.out.println(bbp.getName()+","+bbp.getAge());
        bbp.eat();
        bbp.study();

    }
}
