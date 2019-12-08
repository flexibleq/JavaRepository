package com.fxq.homework.day04.subject03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/*请用代码实现:获取当前的日期,
并把这个日期转换为指定格式的字符串
如2088-08-08 08:08:08。*/
public class DateConvertion {
    public static void main(String[] args) {
       // Date d = new Date();
        Calendar c = Calendar.getInstance();
        Date now = c.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sNow = sdf.format(now);

        System.out.println(sNow);
    }
}
