package com.fxq.homework.day05.subject04;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();
        //创建学生对象
        Student s1 = new Student("张三丰",99,"男");
        Student s2 = new Student("张无忌",99,"男");
        Student s3 = new Student("黄蓉",30,"女");

        //添加元素
        array.add(s1);
        array.add(s2);
        array.add(s3);

        int [] age = new int [array.size()];

        //遍历
        for(int i=0;i<array.size();i++){
            Student s = array.get(i);
            age[i] = s.getAge();
        }
        for (int i = 0; i < age.length; i++) {
            System.out.print(age[i]+" ");
        }
        System.out.println();
        for(int i=0;i<array.size();i++){
            Student ss = array.get(i);
            if(ss.getAge() == getMaxAge(age)){
                Student sss = new Student("小猪佩奇",ss.getAge(),ss.getGender());
                array.set(i,sss);
            }
        }
        for (Student student : array) {
            System.out.println(student.getName()+","+student.getAge()+","+student.getGender());
        }



    }

    public static int getMaxAge(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

}
