package com.fxq.homework.day11.subject01;
//分析以下需求，并用代码实现
//	一共有1000水杯,请通过实体店和官网来进行销售
//	最后统计实体店和官网分别出售的数量
public class SellCup {
    public static void main(String[] args) {
        //创建Cup对象
        Cup cup = new Cup();
        //创建Thread对象
        Thread t1 = new Thread(cup,"实体店");
        Thread t2 = new Thread(cup,"网店");

        t1.start();
        t2.start();

    }
}
