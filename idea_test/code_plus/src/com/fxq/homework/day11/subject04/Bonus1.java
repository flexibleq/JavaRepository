package com.fxq.homework.day11.subject04;

import java.util.ArrayList;

public class Bonus1 implements Runnable{
    private ArrayList<Integer> array;

    public Bonus1(ArrayList<Integer> array){
        this.array = array;
    }

    @Override
    public void run() {
        int count = 0;
        while(true){
            synchronized (this){
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String name = Thread.currentThread().getName();
                if(array.size() == 0){
                    System.out.println(name+"一共产生了"+count+"个大奖");
                    break;
                }
                for (int i = 0; i < array.size(); i++) {
                    Integer money = array.get(i);
                    System.out.println(name+"又产生了一个"+money+"元大奖");
                    count++;
                    array.remove(i);
                }
            }

        }
    }
}
