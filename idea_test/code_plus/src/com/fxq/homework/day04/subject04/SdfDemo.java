package com.fxq.homework.day04.subject04;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SdfDemo {
    public static void main(String[] args)  {
        String sDate = "2018-03-04";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse(sDate);
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
            String sDate1 = sdf1.format(date);
            System.out.println(sDate1);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
