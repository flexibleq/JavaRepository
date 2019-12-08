package com.fxq.homework.day11.subject01;

import org.junit.Test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Cup implements Runnable {
    private  int cup = 5;
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        int count = 0;
        while (true) {
            System.out.println(Thread.currentThread().getName()+":"+count);
            try {
                lock.lock();
                String name = Thread.currentThread().getName();
                if (cup <= 0) {
                    System.out.println(name + "出售了" + count + "只水杯");
                    break;
                }
                System.out.println(name + "出售了第" + cup + "只水杯");
                //count++;
                System.out.println(name + ":"+(++count));
                cup--;
            } finally {
                lock.unlock();
            }
        }
    }
}
