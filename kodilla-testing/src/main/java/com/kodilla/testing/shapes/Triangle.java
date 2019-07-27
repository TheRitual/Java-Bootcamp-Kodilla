package com.kodilla.testing.shapes;

public class Triangle implements Shape{
    private String name = "Triangle";
    private double a,b,c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if(a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("It is impossible to have such a triangle dude!");
            throw new IllegalArgumentException();
        }
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
