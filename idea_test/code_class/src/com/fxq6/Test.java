package com.fxq6;

public class Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.setName("甲斐");
        c.setAge(20);
        System.out.println(c.getName()+","+c.getAge());
        c.catchMouse();

        Cat c1 = new Cat("不回",14);
        System.out.println(c1.getName()+","+c1.getAge());
        c1.catchMouse();

        Dog d = new Dog();
        d.setName("大黄");
        d.setAge(13);
        System.out.println(d.getName()+","+d.getAge());
        d.lookDoor();

        Dog d1 = new Dog("小黄",12);
        System.out.println(d1.getName()+","+d1.getAge());
        d1.lookDoor();
    }
}
