package com.fxq4;

public class AnimalDemo {
    public static void main(String[] args) {
        //向上转型
        Animal a = new Cat();
        System.out.println(a.age);
        //System.out.println(a.weight);
        a.eat();
//        a.playGame();报错
        //向下转型
        Cat cc = (Cat) a;

        cc.playGame();

    }
}
