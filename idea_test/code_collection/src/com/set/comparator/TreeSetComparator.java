package com.set.comparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetComparator {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                int num1 = s1.getGender().compareTo(s2.getGender());
                int num2 = s1.getName().compareTo(s2.getName());
                int num3 = num == 0 ? (num1 == num2 ? num2 : num1) : num;

                return num3;
            }
        });

        //创建学生对象
        Student s1 = new Student("lvjunhao", 23, "m");
        Student s2 = new Student("wangyong", 22, "m");
        Student s3 = new Student("zhangpiansheng", 22, "m");
        Student s4 = new Student("zhangchouchou", 21, "f");
        Student s5 = new Student("fangxiangxiang", 20, "m");

        //不可重复
        Student s6 = new Student("wangyong", 22, "f");

        //添加元素
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        //不可重复
        ts.add(s6);
        //遍历
        //迭代器遍历
        Iterator<Student> it = ts.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge()+","+s.getGender());
        }
        System.out.println("---------------------");
        //增强for循环遍历
        for (Student s : ts) {
            System.out.println(s.getName() + "," + s.getAge()+","+s.getGender());
        }
    }


}
