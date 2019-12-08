package dateutils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    工具类：
    构造方法私有
    成员方法静态
 */
public class DateUtils {
    //构造方法
    private DateUtils(){}

   /* public static String dateToString(Date d,String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String s = sdf.format(d);
        return s;
    }

    public static Date stringToDate(String s,String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date d = sdf.parse(s);
        return d;
    }*/
   //格式化方法
   public static String dateToString(Date d,String format){
       SimpleDateFormat sdf = new SimpleDateFormat(format);
       String s = sdf.format(d);
       return s;
   }

   //解析方法
    public static Date stringToDate(String s,String format) throws ParseException {
       SimpleDateFormat sdf = new SimpleDateFormat(format);
       Date d = sdf.parse(s);
       return d;
    }
}
