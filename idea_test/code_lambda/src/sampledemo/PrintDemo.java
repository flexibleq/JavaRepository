package sampledemo;

public class PrintDemo {
    public static void main(String[] args) {
        //Lambda表达式
        usePrintable(i -> System.out.println(i));
        //方法引用
        usePrintable(System.out::println);
    }
    public static  void usePrintable(Printable p){
        p.print(100);
    }
}
