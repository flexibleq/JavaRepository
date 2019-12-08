package com.guoqinj;

public class Task {

    private boolean flag = false;

    public synchronized void mainMethod(){
        while(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"执行第"+(i+1)+"次");
        }
        flag = false;
        notify();

    }

    public synchronized void subMethod(){
        while(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"执行第"+(i+1)+"次");
        }
        flag = true;
        notify();

    }
}
