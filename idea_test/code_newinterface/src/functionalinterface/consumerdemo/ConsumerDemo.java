package functionalinterface.consumerdemo;

import java.util.function.Consumer;

/*
 * Consumer<T>:包含两个方法
 * void accept(T t):对给定的参数的执行此操作
 * default Consumer<T> andThen(Consumer after):返回一个组合的Consumer，依次执行此操作
 * 然后执行after操作
 * Consumer<T>接口也被称为消费型接口，他消费的数据的数据类型由泛型指定
 *
 * */
public class ConsumerDemo {
    public static void main(String[] args) {
       /* StringOperator("张三丰",(s)->{
            System.out.println(s);
        });*/
//       StringOperator("张三丰",(s)-> System.out.println(s));
//        StringOperator("张三丰",System.out::println);
        /*StringOperator("张三丰",(s)->{
            System.out.println(new StringBuilder(s).reverse().toString());
        });*/
//        StringOperator("张三丰", (s) -> System.out.println(new StringBuilder(s).reverse().toString()));

        StringOperator("张三丰",(s)-> System.out.println(s),(s)-> System.out.println(new StringBuilder(s).reverse().toString()));
    }

    //定义一个方法，消费一个字符串数据
    public static void StringOperator(String name, Consumer<String> c) {
        c.accept(name);
    }
    //定义一个方法，用不同方式消费一个字符串数据两次
    public static void StringOperator(String name,Consumer<String> con1,Consumer<String> con2){
//        con1.accept(name);
//        con2.accept(name);
        con1.andThen(con2).accept(name);
    }
}
