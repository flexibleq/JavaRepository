package staticmethoddemo;

public interface Inter {
    public abstract void show();
    public default void method(){
        System.out.println("method");
    }

    public static void test(){
        System.out.println("test");
    }
}
