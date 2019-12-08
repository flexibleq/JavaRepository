package morethread.method2;

/*
 * 方式二：
 * 实现Runnable接口
 * 1.定义一个类MyRunnable实现Runnable接口
 * 2.在类中重写run()方法
 * 3.创建MyRunnable对象
 * 4.创建Thread类的对象，把MyRunnable对象作为构造方法的参数
 * 5.启动线程
 * */
public class RunnableDemo {
    public static void main(String[] args) {
        //创建对象
        MyRunnable my = new MyRunnable();
        //创建Thread对象
//        Thread th1 = new Thread(my);
////        Thread th2 = new Thread(my);

        Thread th1 = new Thread(my,"高铁");
        Thread th2 = new Thread(my,"飞机");

        //
        th1.start();
        th2.start();

    }
}
