package runtimeexception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RuntimeExceptionDemo {
    public static void main(String[] args) {
        method();
        method2();
    }

    //编译时异常
    public static void method2(){
        try {
            String s = "2019-08-26";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(s);
            System.out.println(date);
        }catch(ParseException e){
            e.printStackTrace();
        }
    }
    //运行时异常
    public static void method(){
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
