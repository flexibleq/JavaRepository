package intconvertstring;

public class Demo {

    //int -> String
    //使用String类中的valueOf（int i）方法

    //String -> int
    //使用Integer类中的parseInt(String s)方法
    public static void main(String[] args) {
        //int ----String
        int number = 122344;
        //方法一
        String s = ""+number;
        System.out.println(s);

        //方法二
        String ss = String.valueOf(number);
        System.out.println(ss);

        //String ----- int
        String sss = "13344334";
        //方法一
        Integer i = Integer.valueOf(sss);
        int ii = i.intValue();
        System.out.println(ii);

        //方法二
        int iii = Integer.parseInt(sss);
        System.out.println(iii);
    }
}
