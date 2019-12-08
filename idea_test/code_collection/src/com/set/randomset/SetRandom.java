package com.set.randomset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

// 编写一个程序，
// 获取10个1-20之间的随机数，
// 要求随机数不能重复，并在控制台输出
public class SetRandom {
    public static void main(String[] args) {
        //创建集合对象
        Set<Integer> set = new HashSet<Integer>();
        //创建随机数对象
        Random r = new Random();
        //循环添加元素
        while(set.size()<10){
            int number = r.nextInt(20) + 1;
            set.add(number);
        }

        //增强for循环遍历
        for(Integer i:set){
            System.out.println(i);
        }

        //方法二
        //创建TreeSet对象
        TreeSet<Integer> ts = new TreeSet<Integer>();
        //循环添加元素
        while(ts.size()<10){
            int num = r.nextInt(20) + 1;
            ts.add(num);
        }
        //遍历
        for(Integer i:ts){
            System.out.println(i);
        }
    }
}
