package com.fxq.day09.subject03;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//1.在main方法中随机生成5个1-10之间的数（包括1和10），将生成的数放到 集合中。
//	2.键盘录入一个数字，判断该数在集合中出现的次数
//
//	例如:键盘录入的数字为: 8 该数字在集合中出现的次数为 X 次
public class ArrayListDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Integer> array = new ArrayList<Integer>();
        //创建随机数对象
        Random r = new Random();
        //键盘录入
        Scanner sc = new Scanner(System.in);
        //在main方法中随机生成5个1-10之间的数，将生成的数放到 集合中。
        for (int i = 0; i < 5; i++) {
            int number = r.nextInt(10) + 1;
            array.add(number);
        }
        System.out.println(array);
        //键盘录入一个数字，判断该数在集合中出现的次数
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        //定义一个计数器
        int count = 0;
        //遍历集合
        for (int i = 0; i < array.size(); i++) {
            if(num == array.get(i)){
                count++;
            }
        }
        System.out.println(num+"在集合中出现的次数为："+count+"次");
    }
}
