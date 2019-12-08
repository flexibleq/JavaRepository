package com.fxq.homework.day13.subject03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

//1.定义学生类:
//	a)	成员变量 姓名：String name;
//	b)	成员变量 成绩：int score；
//	c)	无参及全参构造
//	d)	重写toString()
//2.学生信息与成绩如下：
//	姓名	数学
//	谢霆锋	85
//	章子怡	63
//	刘亦菲	77
//	黄晓明	33
//	岑小村	92
//3.在测试类中完成如下要求
//	a)	将五名学生添加到ArrayList集合
//	b)	使用Collections.sort(List<T> list, Comparator<? super T> c)方法将学生成绩从小到大进行排序（忽略非空判断）
//
//	i.	使用匿名内部类
//	ii.	使用Lambda表达式
public class Test {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();
        //创建学生对象
        Student s1 = new Student("谢霆锋",85);
        Student s2 = new Student("章子怡",63);
        Student s3 = new Student("刘亦菲",77);
        Student s4 = new Student("黄晓明",33);
        Student s5 = new Student("岑小村",92);
        //添加学生对象
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        array.add(s5);
        //使用Collections.sort(List<T> list, Comparator<? super T> c)方法将学生成绩从小到大进行排序（忽略非空判断
        //i.	使用匿名内部类
       /* Collections.sort(array, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getScore() - s2.getScore();
            }
        });

        for(Student s:array){
            System.out.println(s.getName()+","+s.getScore());
        }
        System.out.println("------------------");*/
        //ii.	使用Lambda表达式
        Collections.sort(array,(ss,sss)->{
            return ss.getScore() - sss.getScore();
        });
        for(Student s:array){
            System.out.println(s.getName()+","+s.getScore());
        }
    }


}
