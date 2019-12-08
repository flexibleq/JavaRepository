package staticmethoddemo;

public class Demo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        i.show();
        i.method();
        //静态方法只能通过接口调用
        //public static 返回值 方法名（）{}
        Inter.test();
    }
}
