package com.fxq9;

import java.util.*;

public class StaticDemo {
    public static void main(String[] args) {
        /*Student.university = "华山大学";
        Student s = new Student();
        s.name = "风清扬";
        s.age = 30;
//        s.university = "华山大学";
        s.show();

        Student s1 = new Student();
        s1.name = "令狐冲";
        s1.age = 33;
//        s1.university = "华山大学";
        s1.show();*/
        String[] arr1={"a","b","1","c","b"};
        List lst1 = new ArrayList<String>();
        lst1.add("d");
        Collections.addAll(lst1,arr1);
        System.out.println("运行结果1："+lst1);

        Set<String> set1 = new HashSet<String>();
        set1.add("d");
        Collections.addAll(set1, arr1);
        System.out.println("运行结果2："+set1);

    }
}
