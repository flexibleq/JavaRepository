package com.fxq.homework.day01.subject01;

public class Programmer extends Worker {
    public Programmer() {
    }

    public Programmer(String name, int workId, int salary) {
        super(name, workId, salary);
    }

    @Override
    public void work() {
        System.out.println("程序员在工作");
    }
}
