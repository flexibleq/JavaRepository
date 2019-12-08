package com.fxq.classcode.day14;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        String str = "林青霞,30";
        convert(str,s->s.split(",")[1],s->Integer.parseInt(s),i->i+70);
    }
    public static void convert(String s, Function<String,String> fun1,Function<String,Integer> fun2,Function<Integer,Integer> fun3){
        Integer i = fun1.andThen(fun2).andThen(fun3).apply(s);
        System.out.println(i);
    }
}
