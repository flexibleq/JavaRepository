package com.fxq.homework.day11.subject04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Bonus implements Runnable{
    private int [] arr = {10,5,20,50,100,200,500,800,2,80,300,700};
    private ArrayList<Integer> array = new ArrayList<Integer>();
    private Random r = new Random();
    @Override
    public void run() {
        int count =0;
        while(true) {
            synchronized (this) {
                String name = Thread.currentThread().getName();
                if(array.size() == 12){
                    System.out.println(name+"共抽取了"+count+"次");
                    break;
                }
                int index = r.nextInt(arr.length);
                int money = arr[index];
                if(!array.contains(index)){
                    array.add(index);
                    System.out.println(name+"又产生了一个"+money+"元大奖");
                    count++;
                }
            }

        }

    }
}
