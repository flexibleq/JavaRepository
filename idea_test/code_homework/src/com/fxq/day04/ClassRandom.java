package com.fxq.day04;

import java.util.Random;
import java.util.Scanner;

/*分析以下需求并实现
        1.键盘录入班级人数
        2.根据录入的班级人数创建数组
        3.利用随机数产生0-100的成绩(包含100不包含0),且将成绩赋值给数组
        4.要求:
        (1)打印该班级的不及格人数
        (2)打印该班级的平均分
        (3)打印该班级的总分
        (3)演示格式如下:
        请输入班级人数:
        键盘录入:100
        控制台输出:
        不及格人数:19
        班级平均分:87
        班级总分:xxx*/
public class ClassRandom {
    public static void main(String[] args) {
        //键盘录入班级人数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入班级人数：");
        int n = sc.nextInt();

        //随机数的产生
        Random r = new Random();

        //根据班级人数创建数组
        int [] arr = new int[n];
        //为数组元素赋随机值
        for(int i=0;i<arr.length;i++){
            arr[i] = r.nextInt(100)+1;
        }
        //定义不及格人数计数器
        int count = 0;
        //遍历数组判断不及格人数
        for(int i=0;i<arr.length;i++){
            if(arr[i] < 60){
                count++;
            }
        }
        //输出不及格人数
        System.out.println("不及格人数："+count);

        //定义班级总分
        int sumScore = 0;
        //遍历数组求班级总分
        for(int i=0;i<arr.length;i++){
            sumScore += arr[i];
        }
        //定义班级平均分
        int  average = sumScore/n;
        //输出班级平均分：
        System.out.println("班级平均分："+average);
        //输出班级总分
        System.out.println("班级总分："+sumScore);


    }
}
