package com.fxq.day09.subject04;

public class Car {
    private String brand;
    private int mile;
    private double price;

    public Car() {
    }

    public Car(String brand, int mile, double price) {
        this.brand = brand;
        this.mile = mile;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMile() {
        return mile;
    }

    public void setMile(int mile) {
        this.mile = mile;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
