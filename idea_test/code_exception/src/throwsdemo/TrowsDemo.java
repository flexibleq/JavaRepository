package throwsdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TrowsDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        try {
            method();
        } catch (ParseException e) {
            e.printStackTrace();
        }
       // method2();
        System.out.println("结束");
    }
    //编译时异常
    public static void method() throws ParseException{
        String s = "2019-03-14";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(s);
        System.out.println(date);

    }

    //运行时异常
    public static void method2() throws ArrayIndexOutOfBoundsException{
        int [] arr = {1,2,3};
        System.out.println(arr[3]);
    }
}
