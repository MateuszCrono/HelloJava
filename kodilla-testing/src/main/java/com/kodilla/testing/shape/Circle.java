package com.kodilla.testing.shape;

public class Circle implements Shape {

    private static final String name = "Circle";
    private int field;

    public Circle(int field) {
        this.field = field;
    }

    public String getShapeName() {
        return name;
    }

    public int getField() {
        return field;
    }


}
