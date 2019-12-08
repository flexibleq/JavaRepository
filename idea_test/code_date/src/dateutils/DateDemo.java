package dateutils;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        String s = DateUtils.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s);

        String ss = "2019-08-23 12:12:12";
        Date date = DateUtils.stringToDate(ss, "yyyy-MM-dd HH:mm:ss");
        System.out.println(date);
    }
}
