package com.fxq;

public class Phone {

    //成员变量
    String brand;
    int price;

    //成员方法
    public void call() {
        System.out.println("打电话");
    }

    public void sendMessage(){
        System.out.println("发短信");
    }
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.call();
        ph.sendMessage();
    }
}
