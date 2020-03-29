package com.company.javabai17.subclass;

public class Square extends Rectangle {
    private double side;

    public Square() {
//        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side);
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square["
                + super.toString()
                + ", width= "
                + super.getWidth()
                + "length= "
                + super.getLength()
                + "]";
    }
}
