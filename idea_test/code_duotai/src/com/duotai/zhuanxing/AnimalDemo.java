package com.duotai.zhuanxing;

public class AnimalDemo {
    public static void main(String[] args) {
        //向上转型：父类引用指向子类对象
        Animal a = new Cat();
        a.eat();
        //向下转型：父类引用转为子类对象
        //可以调用子类特有的方法
        Cat c = (Cat) a;
        c.play();

        a = new Dog();
        a.eat();
//        ClassCastException异常
//        Cat cc = (Cat)a;
//        cc.eat();
//        cc.play();
    }
}
