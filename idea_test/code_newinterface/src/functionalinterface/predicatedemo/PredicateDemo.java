package functionalinterface.predicatedemo;

import java.util.function.Predicate;

/*
* Predicate<T>:常用的四个方法
* boolean test(T t):对给定的参数进行判断（判断逻辑由Lambda表达式实现）
* 返回一个布尔值
* default Predicate<T> negate():返回一个逻辑的否定，对应逻辑非
* Predicate<T>接口通常用于判断参数是否满足指定的条件
*
* */
public class PredicateDemo {
    public static void main(String[] args) {
        boolean result = checkString("hello", (s) -> {
            return s.length() > 8;
        });
        System.out.println(result);
        boolean result1 = checkString("helloworld", (s) -> {
            return s.length() > 8;
        });
        System.out.println(result1);
    }
    //判断字符串是否满足指定的条件
    public static boolean checkString(String s,Predicate<String> pre){
        return pre.negate().test(s);
    }
}
