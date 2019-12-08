package com.fxq.day03;

public class ZhuFeng {
    public static void main(String[] args) {
        //定义一个计数器，初始值为0
        int count = 0;

        //定义纸张厚度
        double paper = 0.1;

        //定义珠穆朗玛峰的高度
        int zf = 8844430;

        while(paper<=zf){
            paper*=2;
            count++;
        }
        System.out.println("需要折叠"+count+"次");
    }
}
