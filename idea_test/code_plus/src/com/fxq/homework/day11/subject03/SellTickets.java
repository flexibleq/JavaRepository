package com.fxq.homework.day11.subject03;
//分析以下需求，并用代码实现
//	一共有1000张电影票,可以在两个窗口领取,假设每次领取的时间为3000毫秒,
//	要求:请用多线程模拟卖票过程并打印剩余电影票的数量
public class SellTickets {
    public static void main(String[] args) {
        //创建Tickets对象
        Tickets t = new Tickets();
        //创建Thread对象
        Thread t1 = new Thread(t,"一号窗口");
        Thread t2 = new Thread(t,"二号窗口");

        //启动线程
        t1.start();
        t2.start();
    }
}
