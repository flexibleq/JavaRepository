package com.fxq.homework.day11.subject03;

public class Tickets implements  Runnable{
    private int number = 1000;

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(number>0){
                sell();
                number--;
            }

        }
    }
    public synchronized void sell(){
        System.out.println(Thread.currentThread().getName()+"正在出售第"+number+"票");
        System.out.println("还剩余"+(number-1)+"张票");
    }
}
