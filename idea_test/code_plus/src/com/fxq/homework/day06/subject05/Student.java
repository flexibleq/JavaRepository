package com.fxq.homework.day06.subject05;

import java.util.Comparator;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double score;

    public Student() {
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student s) {
       double num = s.getScore() - this.getScore();
        double num1 = num == 0 ? this.getAge() - s.getAge() : num;
        return (int)num1;
    }
}
