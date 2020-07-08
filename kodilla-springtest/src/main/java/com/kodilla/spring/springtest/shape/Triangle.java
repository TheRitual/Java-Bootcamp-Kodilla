package com.kodilla.spring.springtest.shape;

public class Triangle implements Shape {
    @Override
    public String draw() {
        String msg = "This is a triangle";
        System.out.println(msg);
        return msg;
    }
}