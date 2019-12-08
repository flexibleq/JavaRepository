package com.set.nature;

import java.util.Iterator;
import java.util.TreeSet;
//存储学生对象并遍历，创建集合使用无参构造方法
//要求：按照年龄从小到大进行排序，年龄相同时，按照姓名的字母顺序排序
//ClassCastException学生类要实现Comparator接口
public class TreeSetStudent {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>();
        //创建学生对象
        Student s1 = new Student("xishi",28);
        Student s2 = new Student("wangzhaojun",30);
        Student s3 = new Student("diaochan",29);
        Student s4 = new Student("yangyuhuan",33);

        Student s5 = new Student("zhangyuhuan",33);

        Student s6 = new Student("fengqingyang",29);

        //添加元素
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
            System.out.println(s.getName()+","+s.getAge());
        }

        //增强for循环遍历
        for(Student s:ts){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
