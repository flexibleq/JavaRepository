package com.fxq.homework.day11.subject02;

public class Present implements Runnable{
    private int number = 100;
    private Object obj = new Object();
    @Override
    public void run() {

            while(true){
                synchronized (obj){
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(number>=10){
                    System.out.println(Thread.currentThread().getName()+"送出了第"+number+"份礼物");
                    number--;
                }
            }
        }
    }
}
