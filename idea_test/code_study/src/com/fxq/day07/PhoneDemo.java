package com.fxq.day07;

public class PhoneDemo {
    public static void main(String[] args) {
        //创建手机对象
        Phone p = new Phone();

        p.brand = "华为";
        p.price = 2999;
        System.out.println(p.brand);
        System.out.println(p.price);

        p.call();
        p.sendMessage();
    }
}
