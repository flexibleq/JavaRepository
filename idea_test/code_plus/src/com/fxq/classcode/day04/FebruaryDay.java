package com.fxq.classcode.day04;

import java.util.Calendar;
import java.util.Scanner;

public class FebruaryDay {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year = sc.nextInt();
        //创建Calendar对象
        Calendar c = Calendar.getInstance();
        c.set(year,2,1);
        c.add(Calendar.DATE,-1);

        int date = c.get(Calendar.DATE);
        System.out.println(year+"年的二月份有"+date+"天");

        c.set(year,11,31);
        int i = c.get(Calendar.DAY_OF_YEAR);
        //System.out.println(i);
        if(i==365){
            System.out.println(year+"不是闰年");
        }else{
            System.out.println(year+"是闰年");
        }
    }
}
