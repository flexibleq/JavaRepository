package com.interfacedemo.coachandplayer;

public class Demo {
    public static void main(String[] args) {
        BasketBallCoach bc = new BasketBallCoach();
        bc.setName("小明");
        bc.setAge(20);
        System.out.println(bc.getName()+","+bc.getAge());
        bc.eat();
        bc.teach();

        BasketBallPlayer bbp = new BasketBallPlayer();
        bbp.setName("小安");
        bbp.setAge(20);
        System.out.println(bbp.getName()+","+bbp.getAge());
        bbp.eat();
        bbp.study();

        PingPangCoach ppc = new PingPangCoach();
        ppc.setName("小白");
        ppc.setAge(33);
        System.out.println(ppc.getName()+","+ppc.getAge());
        ppc.eat();
        ppc.teach();
        ppc.speakEnglish();

        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("大白");
        ppp.setAge(34);
        System.out.println(ppp.getName()+","+ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speakEnglish();



    }
}
