package com.kodilla.testing.shapes;

public class Triangle implements Shape{
    private String name = "Triangle";

    public Triangle(double a, double b, double c) {

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getField() {
        return 0;
    }
}
