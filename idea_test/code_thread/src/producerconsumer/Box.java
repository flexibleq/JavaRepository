package producerconsumer;

public class Box {
    private int milk;
    private boolean state = false;

    public synchronized void put(int milk){
        if(state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.milk = milk;
        System.out.println("第"+this.milk+"瓶牛奶已入箱");
        state = true;
        notifyAll();
    }
    public synchronized void get(){
        if(!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("第"+milk+"牛奶已取走");
        state = false;
        notifyAll();
    }
}
