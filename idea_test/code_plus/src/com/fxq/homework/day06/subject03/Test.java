package com.fxq.homework.day06.subject03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*测试类*/
public class Test {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Employee> ts = new TreeSet<Employee>(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                int num = e2.getSalary() - e1.getSalary();
                int num1 = num == 0 ? e1.getAge() - e2.getAge() : num;
                int num2 = num1 == 0 ? e1.getName().compareTo(e2.getName()) : num1;
                return num2;
            }
        });

        //创建Employee对象
        Employee e1 = new Employee("马云",45,10000);
        Employee e2 = new Employee("马化腾",47,5000);
        Employee e3 = new Employee("王健林",50,5000);
        Employee e4 = new Employee("刘强东",52,9000);
        Employee e5 = new Employee("雷军",45,10000);

        //添加元素
        ts.add(e1);
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);
        ts.add(e5);

        //遍历
        //迭代器
        Iterator<Employee> it = ts.iterator();
        while(it.hasNext()){
            Employee e = it.next();
            System.out.println(e.getName()+","+e.getAge()+","+e.getSalary());
        }
        System.out.println();
        //增强for循环
        for(Employee e:ts){
            System.out.println(e.getName()+","+e.getAge()+","+e.getSalary());
        }
    }
}
