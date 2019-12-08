package deadlock;


public class Test {
    public static void main(String[] args) {
        //创建线程任务类对象
        DeadLock dl = new DeadLock();
        //创建线程
        new Thread(dl,"张三").start();
        new Thread(dl,"李四").start();

    }


}
