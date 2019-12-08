package threadpriority;
/*
* Thread类中设置和获取线程优先级的方法：
* public final void setPriority(int newPriority):更改此现成的优先级
* public final int getPriority():返回此线程的优先级
* */
public class PriorityDemo {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        tp1.setName("高铁");
        tp2.setName("飞机");
        tp3.setName("汽车");
        //线程优先级：最低是1，最高是10，默认是5
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(tp1.getPriority());
        System.out.println(tp2.getPriority());
        System.out.println(tp3.getPriority());
        //设置优先级
        tp1.setPriority(10);
        tp2.setPriority(5);
        tp3.setPriority(2);

        tp1.start();
        tp2.start();
        tp3.start();
    }
}
