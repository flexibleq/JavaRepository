package lambdademo;
//需求：启动一个线程，在控制台输出一句话，多线程程序启动了
public class LambdaDemo {
    public static void main(String[] args) {
        //方式一原始
        /*MyRunnable my = new MyRunnable();
        Thread th = new Thread(my);
        th.start();*/
        //方式二匿名内部类
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程程序启动了");
            }
        }).start();*/

        //方式三lambda表达式
        new Thread(()->{
            System.out.println("多线程程序启动了");
        }).start();
    }
}
