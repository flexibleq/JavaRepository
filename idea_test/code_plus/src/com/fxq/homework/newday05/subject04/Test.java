package com.fxq.homework.newday05.subject04;

import java.lang.reflect.Array;
import java.util.ArrayList;
//(1)创建5个学生对象存入ArrayList集合中
//(2)打印最高分的学员姓名、年龄、成绩  [要求封装1个方法
// 参数是集合对象   返回值类型为Student]
//(3)打印5个学生的总成绩和平均分 [要求封装两个方法完成]
//(4)打印不及格的学员信息及数量	[要求封装一个方法完成]
public class Test {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Student> array = new ArrayList<Student>();
        //创建学生对象
        Student s1 = new Student("张三丰",99,100);
        Student s2 = new Student("王重阳",77,45);
        Student s3 = new Student("孙悟空",1000,99);
        Student s4 = new Student("刘备",59,60);
        Student s5 = new Student("赵云",55,97);

        //添加元素
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        array.add(s5);

        Student max = getMax(array);
        System.out.println("成绩最高的学生是："+max.getName()+","+max.getAge()+"岁,"+max.getScore()+"分");
        int sum = getSum(array);
        System.out.println("最高分是："+sum);
        int average = getAverage(array);
        System.out.println("平均分是："+average);
        printStudent(array);

    }
     //定义方法得到分数最高的学生
    public static Student getMax(ArrayList<Student> array){
        Student max = new Student();
        max = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).getScore()>max.getScore()){
                max = array.get(i);
            }
        }
        return max;
    }

    //定义方法求总分
    public static int getSum(ArrayList<Student> array){
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i).getScore();
        }
        return sum;
    }

    //定义方法求平均分
    public static int getAverage(ArrayList<Student> array){
        int avg = getSum(array) / array.size();
        return avg;
    }

    //定义方法打印不及格的学员信息及数量
    public static void printStudent(ArrayList<Student> array){
        int count = 0;
        System.out.println("不及格的学生有：");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if(s.getScore() < 60){
                count++;
                System.out.println(s.getName()+","+s.getAge()+","+s.getScore());
            }
        }
    }
}
