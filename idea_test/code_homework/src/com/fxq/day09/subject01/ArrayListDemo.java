package com.fxq.day09.subject01;

import java.util.ArrayList;
import java.util.Scanner;

//1,创建一个集合ArrayList对象 存储字符串,通过无限循环的方式往集合里添加 字符串 类型的数据
//注意：
//当键盘录入的数据为 end 的时候,就停止录入(end不添加到集合)
//
//2,遍历集合,如果集合中有元素长度小于2 就不输出到控制台
public class ArrayListDemo {
    public static void main(String[] args) {
        //创建一个集合ArrayList对象 存储字符串
        ArrayList<String> array = new ArrayList<String>();
        //键盘录入
        Scanner sc = new Scanner(System.in);
        //,通过无限循环的方式往集合里添加 字符串 类型的数据
        while(true){
            System.out.println("请输入一个字符串：");
            String line = sc.nextLine();
            if(line.equals("end")){
                break;
            }
            array.add(line);
        }
        //遍历集合,如果集合中有元素长度小于2 就不输出到控制台
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            if(s.length() < 2){
                continue;
            }else{
                System.out.println(s);
            }
        }
    }
}
