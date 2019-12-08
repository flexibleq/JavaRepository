package calender;

import java.util.Calendar;

public class CalenderDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
       /* System.out.println(c);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int day =  c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+day);*/
       /* //输出三年前的今天
       c.add(Calendar.YEAR,-3);
       int year = c.get(Calendar.YEAR);
       int month = c.get(Calendar.MONTH)+1;
       int day = c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+day);

        //输出十年后的9天前
        c.add(Calendar.YEAR,10);
        c.add(Calendar.DATE,-9);
        int year1 = c.get(Calendar.YEAR);
        int month1 = c.get(Calendar.MONTH)+1;
        int day1 = c.get(Calendar.DATE);
        System.out.println(year1 +"年"+month1+"月"+day1);*/

        /*//输出21年零3个月的9天前
        c.add(Calendar.YEAR,-21);
        c.add(Calendar.MONTH,-3);
        c.add(Calendar.DATE,-9);

        int year2 = c.get(Calendar.YEAR);
        int month2 = c.get(Calendar.MONTH)+1;
        int day2 = c.get(Calendar.DATE);
        System.out.println(year2 +"年"+month2+"月"+day2+"日");
        */

        //输出20年零3个月前的25天前
        c.add(Calendar.YEAR,-20);
        c.add(Calendar.MONTH,-3);
        c.add(Calendar.DATE,-25);

        int year4 = c.get(Calendar.YEAR);
        int month4 = c.get(Calendar.MONTH)+1;
        int day4 = c.get(Calendar.DATE);

        System.out.println(year4+"年"+month4+"月"+day4+"日");


        //c.set(Calendar.YEAR,2018);
        c.set(2017,11,11);
        int year3 = c.get(Calendar.YEAR);
        int month3 = c.get(Calendar.MONTH)+1;
        int day3 = c.get(Calendar.DATE);

        System.out.println(year3 +"年"+month3+"月"+day3+"日");
    }
}
