import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BirthdayDemo {
    //
    //    1.控制台提示用户输入自己的出生日期，计算该用户已经出生了多少天，并输出到控制台；
    //
    //    2.如果用户输入的生日日期格式有误，需要提示用户，格式有误，并让其继续输入；
    //
    //   提示：可以使用SimpleDateFormat类和Date类去实现
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生日期(yyyy-MM-dd):");
        while(true){
            try {
                String str_date = sc.nextLine();
                //创建SimpleDateFormat对象
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                //解析字符串
                Date birth = sdf.parse(str_date);
                //获取生日对应的毫秒值
                long birTime = birth.getTime();
                //获取现在的毫秒值
                long nowTime = System.currentTimeMillis();
                long day = (nowTime - birTime) / 1000 / 60 / 60 / 24;
                System.out.println("你已经出生了"+day+"天");
                break;
            } catch (ParseException e) {
                System.out.println("你输入的生日日期格式有误，请重新输入：");
            }
        }
    }
}
