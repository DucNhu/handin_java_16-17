package com.company.javabai17.subclass;

import com.company.javabai17.superclass.Point2D;

public class testPoint2D {
    public static void main(String[] args) {
        Point2D p2 = new Point2D(2,1);
        System.out.println(p2);
        p2.setX(2);
        Point3D p3= new Point3D(3f, 3f, 3f);
        System.out.println(p3);
    }
}
