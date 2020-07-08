package com.kodilla.spring.springtest.shape;

public class Circle implements Shape {
    @Override
    public String draw() {
        String msg = "This is a circle";
        System.out.println(msg);
        return msg;
    }
}