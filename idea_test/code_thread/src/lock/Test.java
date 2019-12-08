package lock;

/*
* void lock():获得锁
* void unlock():释放锁
*
* Lock是接口不能直接实例化，这里采用它的实现类ReentrantLock来实例化
* ReentrantLock():创建一个ReentrantLock的实例
* */
public class Test {
    public static void main(String[] args) {

        SellTicket st = new SellTicket();

        Thread th = new Thread(st,"一号窗口");
        Thread th2 = new Thread(st,"二号窗口");
        Thread th3 = new Thread(st,"三号窗口");

        th.start();
        th2.start();
        th3.start();
    }

}
