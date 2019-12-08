package privatemethoddemo;

public interface Inter {
    private void show(){
        System.out.println("初级工程师");
        System.out.println("中级工程师");
        System.out.println("高级工程师");
    }
    private static void method(){
        System.out.println("初级工程师");
        System.out.println("中级工程师");
        System.out.println("高级工程师");
    }
    public default void show1(){
        System.out.println("show1开始执行");
        /*System.out.println("初级工程师");
        System.out.println("中级工程师");
        System.out.println("高级工程师");*/
        show();
        System.out.println("show1结束执行");
    }
    public default void show2(){
        System.out.println("show2开始执行");
       /* System.out.println("初级工程师");
        System.out.println("中级工程师");
        System.out.println("高级工程师");*/
       show();
        System.out.println("show2结束执行");
    }

    public static void method1(){
        System.out.println("method1开始执行");
       /* System.out.println("初级工程师");
        System.out.println("中级工程师");
        System.out.println("高级工程师");*/
       method2();
        System.out.println("method1结束执行");
    }
    public static void method2(){
        System.out.println("method2开始执行");
        /*System.out.println("初级工程师");
        System.out.println("中级工程师");
        System.out.println("高级工程师");*/
        method();
        System.out.println("method2结束执行");
    }
}
