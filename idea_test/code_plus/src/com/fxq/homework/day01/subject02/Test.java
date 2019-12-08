package com.fxq.homework.day01.subject02;

public class Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.setName("加菲");
        c.setAge(5);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();
        Dog d = new Dog();
        d.setName("小黄");
        d.setAge(4);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
    }
}
