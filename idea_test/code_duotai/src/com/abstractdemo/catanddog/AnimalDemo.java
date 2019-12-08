package com.abstractdemo.catanddog;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a = new Cat("甲斐",4);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        Animal aa = new Dog();
        aa.setName("大黄");
        aa.setAge(4);
        System.out.println(aa.getName()+","+aa.getAge());
        aa.eat();

        aa = new Dog("小黄",3);
        System.out.println(aa.getName()+","+aa.getAge());
        aa.eat();
    }
}
