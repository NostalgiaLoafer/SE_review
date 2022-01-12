package com.yan.sample;

public class Cylinder extends Circle{

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolumn(){
        return getArea() * getHeight();
    }

    public void print(){
        super.print();
        System.out.println("cylinder");
    }
}
