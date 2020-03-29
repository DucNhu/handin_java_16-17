package com.company.javabai17.subclass;

import com.company.javabai17.superclass.Point;

public class testPoint {
    public static void main(String[] args) {
        Point p1 = new Point(323,32);
        MovablePoint mo1 = new MovablePoint(2,32);
        System.out.println(mo1);
        System.out.println("move: " + mo1.move());
    }

}
