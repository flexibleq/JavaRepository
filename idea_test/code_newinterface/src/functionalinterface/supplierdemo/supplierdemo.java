package functionalinterface.supplierdemo;

import java.util.function.Supplier;

/*
* Supplier<T>:包含一个无参的方法
* T get():获得结果
* 该方法不需要参数，他会按照某种实现逻辑（由Lambda表达式实现）返回一个数据
* Supplier<T>接口也被称为生产型接口，如果我们指定了接口的泛型，那么接口中的get方法就会生产
* 什么类型的数据
* */
public class supplierdemo {
    public static void main(String[] args) {
       /* String string = getString(() -> {
            return "helloworld";
        });*/
        String string = getString(() -> "helloworld");
        System.out.println(string);
    }
    public static String getString(Supplier<String> s){
        return s.get();
    }
}
