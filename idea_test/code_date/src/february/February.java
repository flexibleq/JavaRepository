package february;

import java.util.Calendar;
import java.util.Scanner;

public class February {
    //任意输入一个年份，输出整个年份的二月份有多少天

    public static void main(String[] args) {
        //键盘录入年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year = sc.nextInt();

        //设置日历对象的年月日
        Calendar c = Calendar.getInstance();
        c.set(year,2,1);
        //从3月1日往前推一天，就是二月的最后一天
        c.add(Calendar.DATE,-1);
        //获取这一天即可
        int date = c.get(Calendar.DATE);

        System.out.println(year+"年的二月份有："+date+"天");
    }
}
