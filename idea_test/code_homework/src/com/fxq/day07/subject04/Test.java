package com.fxq.day07.subject04;

public class Test {
    public static void main(String[] args) {
        Cat c = new Cat("花","波斯猫");
        c.eat();
        c.catchMouse();

        Cat c1 = new Cat();
        c1.setColor("花");
        c1.setBreed("波斯猫");
        c1.eat();
        c1.catchMouse();

        Dog d = new Dog("黑","藏獒");
        d.eat();
        d.lookHome();

        Dog d1 = new Dog();
        d1.setColor("黑");
        d1.setBreed("藏獒");
        d1.eat();
        d1.lookHome();
    }
}
