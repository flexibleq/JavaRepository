package com.fxq.homework.day04.subject02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BirthDay {
    public static void main(String[] args) {
        //Calendar c = Calendar.getInstance();
        String s = "1998-05-16";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date birDay = sdf.parse(s);
           // c.setTime(birDay);
           // long bir = c.getTimeInMillis();
            long bir = birDay.getTime();
            Date nowDay = new Date();
            long now = nowDay.getTime();
            long l = now - bir;
            System.out.println(l*1.0/1000/60/60/24+"天");


        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
