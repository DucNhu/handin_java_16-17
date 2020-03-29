package com.company.javabai16.son;

public class testCylinder {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        System.out.println("radius is: " + cy1.getRadius()
                + ", height is: " + cy1.getHeight()
                + ", COlor is: " + cy1.getColor()
                + ", Base area is: " + cy1.getArea()
                + ", Volume is: " + cy1.getVolume());
        Cylinder cy2 = new Cylinder(5.0, 2.0);
        System.out.println("radius is" + cy2.getRadius()
                + ", height is: " + cy2.getHeight()
                + ", COlor is: " + cy2.getColor()
                + ", Base area is: " + cy2.getArea()
                + ", Volume is: " + cy2.getVolume());
    }
}
