package com.fxq1;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setName("加菲猫");
        c1.setAge(5);
        System.out.println(c1.getName()+","+c1.getAge());
        c1.catchMouse();

        Cat c2 = new Cat("加菲猫",5);
        System.out.println(c2.getName()+","+c2.getAge());
        c2.catchMouse();

        Animal c4 = new Cat();
        c4.setName("jfldsj");
        c4.setAge(4);
        System.out.println(c4.getName()+","+c4.getAge());
    }
}
