package com.fxq.homework.day01.subject01;

public class Worker {
    private String name;
    private int workId;
    private int salary;

    public Worker() {
    }

    public Worker(String name, int workId, int salary) {
        this.name = name;
        this.workId = workId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkId() {
        return workId;
    }

    public void setWorkId(int workId) {
        this.workId = workId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println("员工在工作");
    }
}
