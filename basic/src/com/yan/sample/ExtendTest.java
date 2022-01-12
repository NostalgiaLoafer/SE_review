package com.yan.sample;

public class ExtendTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        System.out.println(circle.getArea());
        Cylinder cylinder = new Cylinder(2,2);
        System.out.println(cylinder.getVolumn());
        cylinder.print();
    }
}
