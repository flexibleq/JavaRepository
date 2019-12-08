package lambdaform;

public class EatableDemo {
    public static void main(String[] args) {
        //方式一 接口多态
        Eatable e = new EatableImpl();
        useEatable(e);

        //方式二  匿名内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("啦啦啦啦啦啦啊啦啦啦啦啦啦");
            }
        });

        //方式三  lambda表达式
        useEatable(()->{
            System.out.println("拉拉拉拉拉拉拉拉啊啦啦啦啊");
        });
    }
    public static void useEatable(Eatable e){
        e.eat();
    }
}
