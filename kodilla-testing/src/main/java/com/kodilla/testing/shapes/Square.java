package com.kodilla.testing.shapes;

public class Square implements Shape {
    private String name = "Square";

    public Square(double a) {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getField() {
        return 0;
    }
}
