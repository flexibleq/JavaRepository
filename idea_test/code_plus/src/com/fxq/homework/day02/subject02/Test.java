package com.fxq.homework.day02.subject02;

public class Test {
    public static void main(String[] args) {
        Breeder b = new Breeder();
        Animal a = new Dog();
        b.breeder(a);
        Dog d = (Dog) a;
        d.swimming();

        a = new Frog();
        b.breeder(a);
        Frog f = (Frog) a;
        f.swimming();

        a = new Sheep();
        b.breeder(a);

    }
}
