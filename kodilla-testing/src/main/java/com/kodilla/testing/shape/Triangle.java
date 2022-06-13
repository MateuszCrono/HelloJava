package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private static final String name = "Triangle";
    private int field;

    public Triangle(int field) {
        this.field = field;
    }

    public String getShapeName() {
        return name;
    }

    public int getField() {
        return field;
    }


}
