package com.company.javabai17.subclass;

import com.company.javabai17.superclass.Shape;

public class Rectangle extends Shape {
    private double width;
    private double length;

    //    Constructor
    public Rectangle() {
    }

    public Rectangle(String color, boolean filled, double side) {
        this.width = 1.0f;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle[Shape= "
                + super.toString()
                + ", width= "
                + width
                + "length= "
                + length
                + "]";
    }
}
