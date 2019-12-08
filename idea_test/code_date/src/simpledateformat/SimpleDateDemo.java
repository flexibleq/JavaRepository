package simpledateformat;

//构造方法
    //public simpleDateFormat():构造一个SimpleDateFormat,使用默认模式和日期格式
    //public simpleDateFormat(String patten):构造一个simpleDateFormat使用给定的模式和日期格式

    //格式化：从Date 到 String
        //public final format(Date date),将日期格式转化成日期/时间字符串
    //解析：从String 到 Date
        //public Date parse(String source),从给定字符串的开始解释文本以生成日期

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateDemo {
    public static void main(String[] args) throws ParseException {
        /*//格式化
        Date d = new Date();
        //默认模式日期格式4
        SimpleDateFormat sdf = new SimpleDateFormat();
        String s = sdf.format(d);
        System.out.println(s);

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String ss = sdf1.format(d);
        System.out.println(ss);

        //解析
        String sss = "2019-08-23 14:23:24";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(sss);
        System.out.println(dd);
*/

        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        String s = sdf.format(d);
        System.out.println(s);

        SimpleDateFormat sdff = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String ss = sdff.format(d);
        System.out.println(ss);

        String sss = "2019年08月25日 15:12:34";
        SimpleDateFormat sdfff = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date ddd = sdfff.parse(sss);
        System.out.println(ddd);

    }

}
