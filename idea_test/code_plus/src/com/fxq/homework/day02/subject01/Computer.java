package com.fxq.homework.day02.subject01;

public class Computer{

    public void useUsb(USB u){
       u.open();
       u.close();


    }

    public void startUp(){
        System.out.println("开机...");
    }

    public void shutDown(){
        System.out.println("关机...");
    }
}
