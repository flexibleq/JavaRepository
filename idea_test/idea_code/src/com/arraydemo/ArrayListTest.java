package com.arraydemo;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();

        Student s1 = new Student("马云",45);

        Student s2 = new Student("马化腾",46);

        Student s3 = new Student("王健林",48);

        array.add(s1);
        array.add(s2);
        array.add(s3);

        for(int i=0;i<array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
