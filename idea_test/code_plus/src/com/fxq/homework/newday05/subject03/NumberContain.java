package com.fxq.homework.newday05.subject03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberContain {
    public static void main(String[] args) {
        //创建集合
        List<Integer> list = new ArrayList<Integer>();
        //添加元素
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();
        if(isExist(list,number)){
            System.out.println(number+"在集合中存在");
        }else{
            System.out.println(number+"在集合中不存在");
        }
    }
    //定义方法判断元素是否存在
    //方法一
    /*public static boolean isExist(List<Integer> list,int value){
       if(list.contains(value)){
           return true;
       }
       return false;
    }*/
    //方法二
    public static boolean isExist(List<Integer> list,int value){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == value){
                return true;
            }
        }
        return false;
    }
}
