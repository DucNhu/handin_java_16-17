package com.company.javabai17.subclass;

import com.company.javabai17.superclass.Point2D;

public class Point3D extends Point2D {
    private float z = 0.0f;
//

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        super();
        this.z = 0.0f;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void set(float x, float y, float z) {
        this.z = z;
        super.setX(x);
        super.setY(y);
    }

    public float[] getXYZ() {
        float[] XYZ = new float[3];
        XYZ[0] = super.getX();
        XYZ[1] = super.getY();
        XYZ[2] = this.z;
        return XYZ;
    }

    public String toString() {
        return "( " + super.getX() + ", " + super.getY() + ", " + z + ")";
    }
}
