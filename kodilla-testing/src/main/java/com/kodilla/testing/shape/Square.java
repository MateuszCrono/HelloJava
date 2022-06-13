package com.kodilla.testing.shape;

public class Square implements Shape {

    private static final String name = "Square";
    private int field;

    public Square(int field) {
        this.field = field;
    }

    public String getShapeName() {
        return name;
    }

    public int getField() {
        return field;
    }
}
