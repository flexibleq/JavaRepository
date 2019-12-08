package com.innerclass.inner_class.niming_inner_class;

public class FlyDemo {
    public static void main(String[] args) {
        FlyOperator fo = new FlyOperator();
        //使用接口多态来创建实现类对象传入方法中
        Fly f = new Bird();
        fo.useFly(f);
        //使用匿名内部类传入方法中
        fo.useFly(new Fly() {
            @Override
            public void fly() {
                System.out.println("麻雀展翅翱翔");
            }
        });

        fo.useFly(new Fly() {
            @Override
            public void fly() {
                System.out.println("雄鹰展翅翱翔");
            }
        });



    }
}
