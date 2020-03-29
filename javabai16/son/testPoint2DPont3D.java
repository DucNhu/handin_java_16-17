package com.company.javabai16.son;

import com.company.javabai16.dad.Point2D;
public class testPoint2DPont3D {
    public static void main(String[] args) {
        Point2D p2a = new Point2D(1, 10);
        System.out.println(p2a);
        Point2D p2b = new Point2D();
        System.out.println(p2b);
//        setter, getter
        p2a.setX(3);
        p2a.setY(4);
        System.out.println(p2a);
        System.out.println("x is: " + p2a.getX());
        System.out.println("x is: " + p2a.getY());
//        Test Point 3d
        Point3D p3a = new Point3D(11,21,13);
        System.out.println(p3a);
        Point3D p3b = new Point3D();
        System.out.println(p3b);
        p3a.setX(21);
        p3a.setY(21);
        p3a.setZ(21);
        System.out.println(p3a);
        System.out.println("x is: " + p3a.getX());
        System.out.println("y is: " + p3a.getY());
        System.out.println("z is: " + p3a.getZ());
    }

}
