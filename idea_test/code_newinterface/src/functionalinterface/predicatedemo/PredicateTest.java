package functionalinterface.predicatedemo;

import java.util.function.Predicate;

/*
 * Predicate<T>:
 * default Predicate<T> and (Predicate other):返回一个组合判断，对应短路与
 * default Predicate<T> or (Predicate other):返回一个组合判断，对应短路或
 * */
public class PredicateTest {
    public static void main(String[] args) {
        boolean result = checkString("hello", s -> s.length() < 15, s -> s.length() > 10);
        System.out.println(result);

        boolean result2 = checkString("helloworld", s -> s.length() > 8, s -> s.length() < 12);
        System.out.println(result2);
    }

    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
        /*boolean b1 = pre1.test(s);
        boolean b2 = pre2.test(s);
        boolean b3 = b1 && b2;
        return b3;*/
       /* boolean b = pre1.and(pre2).test(s);
        return b;*/
        boolean b = pre1.or(pre2).test(s);
        return b;
    }
}
