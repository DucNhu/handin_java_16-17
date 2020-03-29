package com.company.javabai17.subclass;

import com.company.javabai17.superclass.Shape;

public class Circle extends Shape {
    private double radius;

    //    COnstructor
    public Circle() {
        super();
        this.radius = 0.0f;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * 2.0 * Math.PI;
    }
    @Override
    public String toString() {
        return "Circle[" +
                super.toString()
                + ", filled="
                + super.isFilled()
                + ", radius= "
                + radius
                + "];";
    }
}
