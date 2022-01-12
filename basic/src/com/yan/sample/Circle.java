package com.yan.sample;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * getRadius() * getRadius();
    }

    public void print(){
        System.out.println("circle");
    }
}
