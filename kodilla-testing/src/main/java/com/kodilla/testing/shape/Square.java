package com.kodilla.testing.shape;

public class Square implements Shape {


    private String name;
    private int field;

    public Square(String name, int field) {
        this.name = name;
        this.field = field;
    }

    public String getShapeName() {
        return name;
    }

    public int getField() {
        return field;
    }
}
