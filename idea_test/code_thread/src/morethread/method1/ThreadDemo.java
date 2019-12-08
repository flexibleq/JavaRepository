package morethread.method1;
/*
* 方式一：
* 继承Tread类
* 1.定义一个类MyTread继承Tread类
* 2.在MyTread类中重写run()方法
* 3.创建MyTread类的对象
* 4.启动线程
*
* Thread类中获取和设置线程名称的方法
* void setName(String name):将此线程的名称更改为等于参数name
* String getName():返回此线程的名称
* */
public class ThreadDemo {
    public static void main(String[] args) {
        //创建MyTread类的对象
        MyThread mt1 = new MyThread("红桃");
        MyThread mt2 = new MyThread("黑桃");
        //
       // mt1.setName("大王：");
        //mt2.setName("小王：");
        //启动线程
        mt1.start();
        mt2.start();

        //static Thread currentThread()：返回对当前正在执行的线程对象的引用
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }
}
