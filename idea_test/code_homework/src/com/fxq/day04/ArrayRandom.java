package com.fxq.day04;

import java.util.Random;
import java.util.Scanner;

/*分析以下需求并实现
        1.键盘录入一个数据作为数组的长度
        2.请使用随机数给数组赋值
        3.再次键盘录入一个数据,统计这个数在该数组中出现的次数
        例如:
        数组的元素为: {1,2,5,1}
        要找的数为:1
        最终控制台打印的结果为: 1 在数组里出现的次数为 2 次*/
public class ArrayRandom {
    public static void main(String[] args) {
        //键盘录入数组长度
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组的长度：");
        int n = sc.nextInt();

        //定义数组
        int [] arr = new int[n];

        //创建随机数对象
        Random r = new Random();

        //遍历数组为元素赋随机值
        for(int i=0;i<arr.length;i++){
            arr[i] = r.nextInt(100);
        }

        //再次录入一个数字
        System.out.println("请输入要查找的数字：");
        int number = sc.nextInt();
        //定义一个计数器
        int count = 0;
        //遍历数组获取该数在数组中出现的次数
        for(int i=0;i<arr.length;i++){
            if(arr[i] == number){
                count++;
            }
        }

        //遍历数组输出元素
        System.out.println("数组的元素为：");
        System.out.print("{");
        for(int i=0;i<arr.length;i++){
            if(i == arr.length-1){
                System.out.print(arr[i]+"}");
            }else{
                System.out.print(arr[i]+",");
            }
        }
        System.out.println();
        //输出要找的数
        System.out.println("要找的数为："+number);

        System.out.println(number+"在数组里出现"+count+"次");
    }
}
