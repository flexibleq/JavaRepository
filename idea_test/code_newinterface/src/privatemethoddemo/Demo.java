package privatemethoddemo;

public class Demo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        i.show1();
        System.out.println("----------");
        i.show2();
        System.out.println("----------");
        Inter.method1();
        System.out.println("----------");
        Inter.method2();
    }
}