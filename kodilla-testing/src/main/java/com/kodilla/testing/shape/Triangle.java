package com.kodilla.testing.shape;

public class Triangle implements Square {

    private String name;
    private int field;

    public Triangle(String name, int field) {
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
