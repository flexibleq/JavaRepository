package com.fxq.homework.day11.subject04;

import java.util.HashSet;

//分析以下需求，并用代码实现 (有难度!)
//	有一个抽奖池,该抽奖池中存放了奖励的金额,该抽奖池中的奖项为 {10,5,20,50,100,200,500,800,2,80,300,700};
//	创建两个抽奖箱(线程)设置线程名称分别为“抽奖箱1”，“抽奖箱2”，
//	随机从抽奖池中获取奖项元素并打印在控制台上,格式如下:
//1,每次抽取到的奖金是不能重复的
//2,两条线程抽取奖的有效次数刚好为12次
//3,最后统计每条线程分别抽取了多少次
public class Test {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        Bonus b = new Bonus();
        Thread t1 = new Thread(b,"抽奖箱1");
        Thread t2 = new Thread(b,"抽奖箱2");

        t1.start();
        t2.start();
    }
}
