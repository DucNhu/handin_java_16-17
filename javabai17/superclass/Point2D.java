package com.company.javabai17.superclass;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
//

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] XY = new float[2];
        this.x = XY[0];
        this.x = XY[1];
        return XY;
    }

    public String toString() {
        return "( " + x + ", " + y + ")";
    }
}