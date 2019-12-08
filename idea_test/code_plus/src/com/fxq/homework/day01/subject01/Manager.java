package com.fxq.homework.day01.subject01;

public class Manager extends Worker {
    public Manager() {
    }

    public Manager(String name, int workId, int salary) {
        super(name, workId, salary);
    }

    @Override
    public void work() {
        System.out.println("项目经理在工作");
    }
}
