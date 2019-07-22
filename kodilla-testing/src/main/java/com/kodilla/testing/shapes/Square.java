package com.kodilla.testing.shapes;

public class Square implements Shape {
    private String name = "Square";
    private double side;

    public Square(double a) {
        if(a < 0) {
            throw new IllegalArgumentException();
        }
        side = a;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getField() {
        return Math.pow(side,2);
    }
}
