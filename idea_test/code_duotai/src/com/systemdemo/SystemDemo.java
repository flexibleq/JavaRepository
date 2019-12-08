package com.systemdemo;

public class SystemDemo {
    public static void main(String[] args) {
//        System.out.println("开始");
//        System.exit(0);终止了jvm的运行
//        System.out.println("结束");

        System.out.println(System.currentTimeMillis() * 1.0 / 1000 / 60 / 60 / 24 / 365);

        long start = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();

        System.out.println(end-start);
    }
}
