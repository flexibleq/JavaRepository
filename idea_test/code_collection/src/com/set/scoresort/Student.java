package com.set.scoresort;

public class Student {
    private String name;
    private int Chinense;
    private int math;

    public Student() {
    }

    public Student(String name, int chinense, int math) {
        this.name = name;
        Chinense = chinense;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinense() {
        return Chinense;
    }

    public void setChinense(int chinense) {
        Chinense = chinense;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getSum() {
        return this.Chinense + this.math;
    }
}
