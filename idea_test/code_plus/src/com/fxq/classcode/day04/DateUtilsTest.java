package com.fxq.classcode.day04;

import java.text.ParseException;
import java.util.Date;

public class DateUtilsTest {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        String s = DateUtils.dateToString(d,"yyyy-MM-dd HH:mm:ss");
        System.out.println(s);

        String ss = "2019-9-14 15:34:56";
        Date date = DateUtils.stringToDate(ss, "yyyy-MM-dd HH:mm:ss");
        System.out.println(date);
    }
}
