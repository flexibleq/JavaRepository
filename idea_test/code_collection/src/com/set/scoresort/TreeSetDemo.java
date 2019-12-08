package com.set.scoresort;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //创建TreeSet对象
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.getSum() - s1.getSum();
                int num1 = num == 0 ? s1.getChinense()-s2.getChinense() : num;
                int num2 = num1 == 0 ? s1.getName().compareTo(s2.getName()) : num1;
                return num2;
                //return 0;
            }
        });

        //创建学生对象
        Student s1 = new Student("王涌",96,97);
        Student s2 = new Student("吕俊豪",97,98);
        Student s3 = new Student("张翩笙",99,99);
        Student s4 = new Student("王小涌",99,100);

        Student s5 = new Student("吕小豪",99,99);
        Student s6 = new Student("吕大豪",100,98);

        //添加对象
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        //遍历
        //迭代器遍历
        Iterator<Student> it = ts.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getChinense()+","+s.getMath()+","+s.getSum());
        }
        System.out.println("--------------------------------------");
        //增强for循环遍历
        for(Student s:ts){
            System.out.println(s.getName()+","+s.getChinense()+","+s.getMath()+","+s.getSum());
        }
    }
}
