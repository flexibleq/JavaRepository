package com.fxq.homework.day06.subject04;

import java.util.Scanner;
import java.util.TreeSet;

//(1)键盘录入N个数据到 泛型为 Double 的集合,如果录入的是886 停止录入
//	(2)对其进行排序
//	(3)遍历输出所有元素
//	//注意:元素不能重复
public class TreeSetScanner {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Double> ts = new TreeSet<Double>();
        //键盘录入
        Scanner sc = new Scanner(System.in);
        //循环将元素添加入集合
        while(true){
            System.out.println("请输入一个数字：");
            double number = sc.nextDouble();
            ts.add(number);
            if(number == 886){
                break;
            }
        }

        //遍历
        //增强for循环
        for(Double d:ts){
            System.out.println(d);
        }
    }
}
