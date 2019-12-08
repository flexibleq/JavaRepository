package com.fxq.classcode.day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BirthdayDemo {
    public static void main(String[] args) throws ParseException {
        //创建当前时间的Date对象
        Date dNow = new Date();
        //获取当前时间的毫秒值
        long tNow = dNow.getTime();
        //定义一个表示出生日期的字符串
        String bir = "1999-03-16";
        //创建SimpleDateFormat对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //解析字符串
        Date dBir = sdf.parse(bir);
        //获取出生日期的毫秒值
        long tBir = dBir.getTime();
        //获取天数
        long day = tNow - tBir;
        System.out.println(day/1000/60/60/24+"天");
    }
}
