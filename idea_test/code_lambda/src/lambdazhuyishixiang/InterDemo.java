package lambdazhuyishixiang;

public class InterDemo {
    public static void main(String[] args) {
        //使用lambda表达式必须有接口，并且接口中有且仅有一个抽象方法
        show(()->System.out.println("lambda表达式"));
        //必须要有上下文，才能推导出Lambda表达式对应的接口
        new Thread(()->{
            System.out.println("lambda表达式");
        }).start();

    }
    public static void show(Inter i){
        i.inter();
    }
}
