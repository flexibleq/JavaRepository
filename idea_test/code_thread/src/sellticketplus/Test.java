package sellticketplus;

//同步方法的锁对象是this
//同步静态方法的锁对象是类名.class
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
