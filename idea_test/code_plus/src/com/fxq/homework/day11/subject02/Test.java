package com.fxq.homework.day11.subject02;
//分析以下需求，并用代码实现
//	有100份礼品,两人同时发送，当剩下的礼品小于10份的时候则不再送出，
//	利用多线程模拟该过程并将线程的名称打印出来.
public class Test {
    public static void main(String[] args) {
        //创建Present对象
        Present p = new Present();
        //创建Thread对象
        Thread t1 = new Thread(p,"小明");
        Thread t2 = new Thread(p,"小白");
        //启动线程
        t1.start();
        t2.start();
    }
}
