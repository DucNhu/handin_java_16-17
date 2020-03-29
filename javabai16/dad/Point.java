package com.company.javabai16.dad;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] xy = new int[2];
        this.x = xy[0];
        this.y = xy[1];
        return xy;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[" + x + "," + y + "]";
    }

    protected double distance(Point end) {
        int xDiff = this.x;
        int yDiff = this.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
