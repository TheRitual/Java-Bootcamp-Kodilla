package com.kodilla.testing.shapes;

public class Circle implements Shape{
    private String name = "Circle";
    private double radius;

    public Circle(double r) {
        if( r < 0) {
            throw new IllegalArgumentException();
        }
        radius = r;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getField() {
        return Math.pow(radius,2)*Math.PI;
    }
}
