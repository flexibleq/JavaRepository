package com.interfacedemo.catanddog;

public class AnimalDemo {
    public static void main(String[] args) {
        Jumpping j = new Cat();
        j.jump();

        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(3);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a = new Cat("甲斐",4);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        Cat c = new Cat();
        c.setName("甲子");
        c.setAge(5);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();
        c.jump();

        Cat cc = new Cat("乙丑",6);
        System.out.println(cc.getName()+","+cc.getAge());
        cc.eat();
        cc.jump();

        System.out.println("---------------------");

        Jumpping jj = new Dog();
        jj.jump();

        Animal aa = new Dog();
        aa.setName("丙寅");
        aa.setAge(1);
        System.out.println(aa.getName()+","+aa.getAge());
        aa.eat();

        aa = new Dog("丁卯",2);
        System.out.println(aa.getName()+","+aa.getAge());
        aa.eat();

        Dog d = new Dog();
        d.setName("戊辰");
        d.setAge(3);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
        d.jump();

        Dog dd = new Dog("己巳",4);
        System.out.println(dd.getName()+","+dd.getAge());
        dd.eat();
        dd.jump();

    }
}
