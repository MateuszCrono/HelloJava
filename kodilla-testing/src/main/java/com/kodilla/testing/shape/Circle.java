package com.kodilla.testing.shape;

public class Circle implements Shape {

    private String name;
    private int field;

    public Circle(String name, int field) {
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
