package deadlock;

public class DeadLock  implements Runnable{
    //定义两把锁
    private String kl = "筷子左";
    private String kr = "筷子右";
    //定义变量用于判断执行哪个代码快
    private int i;

    @Override
    public void run() {
        while(true){
            String name = Thread.currentThread().getName();
            if(i % 2 == 0){
                synchronized (kl){
                    System.out.println(name+"拿到了"+kl+"，等待"+kr);
                    synchronized (kr){
                        System.out.println(name+"拿到了"+kr+",开吃");
                    }
                }
            }else{
                synchronized (kr){
                    System.out.println(name+"拿到了"+kr+"，等待"+kl);
                    synchronized (kl){
                        System.out.println(name+"拿到了"+kl+",开吃");
                    }
                }
            }
            i++;
        }
    }
}
