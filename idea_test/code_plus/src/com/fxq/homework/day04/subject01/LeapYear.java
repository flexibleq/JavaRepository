package com.fxq.homework.day04.subject01;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //键盘输入年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year = sc.nextInt();

        Calendar c = Calendar.getInstance();
       /* c.set(year,2,1);
        c.add(Calendar.DATE,-1);
        //int y = c.get(Calendar.YEAR);
        //int m = c.get(Calendar.MONTH);
        int d = c.get(Calendar.DATE);
        if(d == 29){
            System.out.println(year+"年是闰年");
        }else{
            System.out.println(year+"年不是闰年");
        }*/

        c.set(year,11,31);
        int day = c.get(Calendar.DAY_OF_YEAR);
        if(day == 366){
            System.out.println(year + "年是闰年");
        }else{
            System.out.println(year+"年不是闰年");
        }


        // Date date = new Date();
    }

}
