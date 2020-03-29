package com.company.javabai16.son;

import com.company.javabai16.dad.Circle;

public class Cylinder extends Circle {
    private double height;
//    constructors
    public Cylinder() {
        super();
        this.height = 10;
        System.out.println("Constructed a Cylinder with Cylinder(height");
    }

    public Cylinder(double height) {
        this.height = height;
        System.out.println("Constructed a Cylind wit Cylinder(");

    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        System.out.println("Constructed a Cylind wit Cylinder(height, radius");

    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
        System.out.println("Constructed a Cylind wit Cylinder(height, radius, color");
    }
//    getter

    public double getHeight() {
        return height;
    }
//    setter

    public void setHeight(double height) {
        this.height = height;
    }
//
    public double getVolume() {
        return getArea() * height;
    }
    public String toString() {
        return "This is a Cylinder";
    }

}
