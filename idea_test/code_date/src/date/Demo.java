package date;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        //public Date(),分配一个Date对象，并初始化，以便他代表他被分配的时间，精确到毫秒
        Date d1 = new Date();
        System.out.println(d1);

        Date d3 = new Date();
        System.out.println(d3);

        Date d4 = new Date();
        System.out.println(d4);

        //public Date(long date),分配一个Date 对象，并将其初始化为从标准基准时间起指定的毫秒数
        long date = 1000*60*60;
        Date d2 = new Date(date);
        System.out.println(d2);

        long da = 1000*3600*3600;
        Date d5 = new Date(da);
        System.out.println(d5);

        long dd =  1000*7200*7200;
        Date ddd = new Date(dd);
        System.out.println(ddd);

    }
}
