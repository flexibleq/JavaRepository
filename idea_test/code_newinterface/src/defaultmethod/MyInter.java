package defaultmethod;

public interface MyInter {
    void show1();
    void show2();
    /*public default void show3(){
        System.out.println("show3");
    }*/
    //格式：public default 返回值类型 方法名（参数列表）{}
    //注意事项：
    //默认方法不是抽象方法，所以不强制被重写，但是可以被重写，重写的时候去掉default关键字
    //public 可以省略，default不能省略
    default void show3(){
        System.out.println("show3");
    }

}
