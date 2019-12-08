package com.fxq.homework.day06.subject05;

import java.util.Comparator;
import java.util.TreeSet;
//升序：this 或者s1放前面
//降序：this 或者s1放后面
public class ComparatorDemo {
    public static void main(String[] args) {
        //创建集合对象---比较器排序
       /* TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int  compare(Student s1, Student s2) {
               double num = s2.getScore() - s1.getScore();
               double num1 = num == 0 ? s1.getAge() - s2.getAge() : num;
               return (int)num1;
            }
        });*/

       //创建集合对象-----自然排序
        TreeSet<Student> ts = new TreeSet<Student>();

        //创建学生对象
        Student s1 = new Student("liusan",20,90.0);
        Student s2 = new Student("lisi",22,90.0);
        Student s3 = new Student("wangwu",20,99.0);
        Student s4 = new Student("sunliu",22,100.0);
        //Student s5 = new Student("lisi",22,90.0);
        //添加元素
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        //ts.add(s5);
        //遍历
        //增强for循环
        for(Student s:ts){
            System.out.println(s.getName()+","+s.getAge()+","+s.getScore());
        }
    }
}
