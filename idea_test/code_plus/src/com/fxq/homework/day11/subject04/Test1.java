package com.fxq.homework.day11.subject04;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Integer> array = new ArrayList<Integer>();
        //添加元素
        array.add(10);
        array.add(5);
        array.add(20);
        array.add(50);
        array.add(100);
        array.add(200);
        array.add(500);
        array.add(800);
        array.add(2);
        array.add(80);
        array.add(300);
        array.add(700);

        Collections.shuffle(array);

        //创建Bonus1对象
        Bonus1 b = new Bonus1(array);

        //创建Thread对象
        Thread t1 = new Thread(b,"抽奖池1");
        Thread t2 = new Thread(b,"抽奖池2");

        t1.start();
        t2.start();

    }
}
