package streammiddle;

import java.util.ArrayList;

/*
* Stream流的常见终结操作方法
* void forEach(Consumer action):对此流的每个元素执行操作
* Consumer接口中的方法 void accept(T t):对给定的参数执行此操作
* long count():返回此流中的元素数
* */
public class streamenddemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        //添加元素
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("javase");
        array.add("javaee");

        array.stream().forEach(System.out::println);

        long count = array.stream().count();
        System.out.println(count);
    }
}
