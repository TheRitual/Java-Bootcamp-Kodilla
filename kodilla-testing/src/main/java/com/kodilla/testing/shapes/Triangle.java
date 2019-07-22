package com.kodilla.testing.shapes;

public class Triangle implements Shape{
    private String name = "Triangle";
    private double a,b,c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getField() {
        double s = (a + b + c)/2.0d;
        double sqr = (s * (s-a) * (s-b) * (s-c));
        return Math.sqrt(sqr);
    }
}
