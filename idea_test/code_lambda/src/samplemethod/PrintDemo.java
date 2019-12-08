package samplemethod;

public class PrintDemo {
    public static void main(String[] args) {
        //usePrintable(s-> System.out.println(s));
        //引用方法
        //方法引用符：::
        //可推导的就是可省略的
        usePrintable(System.out::println);
    }
    public static void usePrintable(Printable p){
        p.print("小蜜蜂，嗡嗡嗡");
    }
}
