package com.fxq.homework.day15.subject01;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void run(){
        System.out.println("我"+name+"是一个好人");
    }
    public void show(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = sdf.format(date);
        System.out.println(s);
    }

    public void copy(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        ArrayList<String> array = new ArrayList<String>();
        while((line = br.readLine()) != null){
            array.add(line);
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        for (int i = array.size() - 1; i >= 0; i--) {
            bw.write(array.get(i));
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
