package sellticket;

public class Test {
    public static void main(String[] args) {
        //创建SellTicket对象
        SellTicket st = new SellTicket();
        //创建Thread对象
        Thread th = new Thread(st,"一号窗口");
        Thread th2 = new Thread(st,"二号窗口");
        Thread th3 = new Thread(st,"三号窗口");

        //启动线程
        th.start();
        th2.start();
        th3.start();
    }

}
