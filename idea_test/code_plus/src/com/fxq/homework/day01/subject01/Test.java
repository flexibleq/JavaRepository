package com.fxq.homework.day01.subject01;

import com.fxq.homework.day01.subject01.Manager;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setName("马达");
        m.setWorkId(1);
        m.setSalary(8000);

        System.out.println(m.getName()+","+m.getWorkId()+","+m.getSalary());
    }
}
