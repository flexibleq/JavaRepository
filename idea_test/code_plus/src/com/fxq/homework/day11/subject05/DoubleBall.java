package com.fxq.homework.day11.subject05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class DoubleBall implements Runnable {
    private int people = 100;
    private HashSet<Integer> hs = new HashSet<Integer>();
    private ArrayList<Integer> array = new ArrayList<>();
    private Random r = new Random();

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (this) {
                String name = Thread.currentThread().getName();
                if (people == 0) {
                    System.out.println("从" + name + "入场的总共：" + count + "位员工");
                    break;
                }

                while (true) {
                    int red = r.nextInt(32) + 1;
                    hs.add(red);
                    if (hs.size() == 6) {
                        break;
                    }
                }
                array.addAll(hs);
                Collections.sort(array);
                int blue = r.nextInt(16)+1;
                array.add(blue);
                System.out.println("编号为" + (101 - people) + "的员工从" + name + "入场，拿到的双色球彩票号码是：" + array);
                people--;
                count++;
                hs.clear();
                array.clear();
            }
        }
    }
}
