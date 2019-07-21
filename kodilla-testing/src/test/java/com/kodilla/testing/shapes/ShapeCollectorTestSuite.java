package com.kodilla.testing.shapes;

import com.kodilla.utilities.*;
import org.junit.*;

public class ShapeCollectorTestSuite {
    private static ColorizeText ct = new ColorizeText(true);

    @BeforeClass
    public static void beforAll() {
        System.out.println(ct.yellow("TESTS BEGIN:"));
    }

    @AfterClass
    public static void afterAll() {
        System.out.println(ct.yellow(":TESTS END"));
    }

    @Before
    public void before() {
        System.out.println(ct.cyan("TEST CASE BEGIN:"));
    }

    @After
    public void after() {
        System.out.println(ct.cyan(":TEST CASE END"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testNegativeCircle() {
        System.out.println(ct.purple("Testing Negative Circle"));
        Shape result = new Circle(-20);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testNegativeSquare() {
        System.out.println(ct.purple("Testing Negative Square"));
        Shape result = new Square(-20);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testNegativeTriangle() {
        System.out.println(ct.purple("Testing Negative Triangle"));
        Shape result = new Triangle(-20,-30, -1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testImpossibleTriangle() {
        System.out.println(ct.purple("Testing Impossible Triangle"));
        Shape result = new Triangle(5,6, 25);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testNullTriangle() {
        System.out.println(ct.purple("Testing Null Circle"));
        Shape result = new Triangle(-20,-30, 0);
    }

    @Test (expected = NullPointerException.class)
    public void testAddNull() {
        System.out.println(ct.purple("Testing adding null"));
        ShapeCollector sc = new ShapeCollector();
        sc.add(null);
    }

    @Test (expected = NullPointerException.class)
    public void testGetFromEmptyCollection() {
        System.out.println(ct.purple("Testing getting from empty collection"));
        ShapeCollector sc = new ShapeCollector();
        Shape result = sc.get(3);
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testGetOutOfRange() {
        System.out.println(ct.purple("Testing getting out of range"));
        ShapeCollector sc = new ShapeCollector();
        sc.add(new Circle(1));
        Shape result = sc.get(3);
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testRemoveOutOfRange() {
        System.out.println(ct.purple("Testing removing out of range"));
        ShapeCollector sc = new ShapeCollector();
        sc.remove(2);
    }
}
