package com.kodilla.testing.shapes;

import com.kodilla.utilities.ColorizeText;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private static ColorizeText ct;
    private List<Shape> shapes;

    ShapeCollector(){
        shapes = new ArrayList<>();
    }

    public void add(Shape shape) {
        if(shape == null) {
            throw new NullPointerException();
        }
        shapes.add(shape);
    }

    public boolean remove(int index) {
        return false;
    }

    public Shape get(int index) {
        try {
            return shapes.get(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(ct.red("ERROR:" + e));
            return null;
        }
    }
}
