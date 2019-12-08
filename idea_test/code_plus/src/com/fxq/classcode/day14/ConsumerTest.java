package com.fxq.classcode.day14;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        String[] strArr = {"张臭臭,1","张哼哼,3","张不乖,18"};
        operatString(strArr,s -> System.out.print("姓名："+s.split(",")[0]),s -> System.out.println(",年龄："+Integer.parseInt(s.split(",")[1])));
    }

    public static void operatString(String[] str, Consumer<String> con1,Consumer<String> con2){
        for (String s : str) {
            con1.andThen(con2).accept(s);
        }
    }
}
