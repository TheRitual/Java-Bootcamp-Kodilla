package com.kodilla.testing.shapes;

import com.kodilla.utilities.*;
import org.junit.*;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void testCircleName() {
        System.out.println(ct.purple("Testing Circle getName"));
        Shape result = new Circle(20);
        assertEquals("Circle", result.getName());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testNegativeSquare() {
        System.out.println(ct.purple("Testing Negative Square"));
        Shape result = new Square(-20);
    }

    @Test
    public void testSquareName() {
        System.out.println(ct.purple("Testing Square getName"));
        Shape result = new Square(20);
        assertEquals("Square", result.getName());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testNegativeTriangle() {
        System.out.println(ct.purple("Testing Negative Triangle"));
        Shape result = new Triangle(-20,-30, -1);
    }

    @Test
    public void testTriangleName() {
        System.out.println(ct.purple("Testing Triangle getName"));
        Shape result = new Triangle(2,3,4);
        assertEquals("Triangle", result.getName());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testImpossibleTriangle() {
        System.out.println(ct.purple("Testing Impossible Triangle"));
        Shape result = new Triangle(5,6, 25);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testZeroTriangle() {
        System.out.println(ct.purple("Testing Zero Circle"));
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

    @Test (expected = NullPointerException.class)
    public void testGetOutOfRange() {
        System.out.println(ct.purple("Testing getting out of range"));
        ShapeCollector sc = new ShapeCollector();
        sc.add(new Circle(1));
        Shape result = sc.get(3);
    }

    @Test
    public void testRemoveOutOfRange() {
        System.out.println(ct.purple("Testing removing out of range"));
        ShapeCollector sc = new ShapeCollector();
        sc.remove(2);
    }

    @Test
    public void testCalculateCircleField() {
        System.out.println(ct.purple("Testing calculating field of Circle"));
        ShapeCollector sc = new ShapeCollector();
        sc.add(new Circle(10));
        double result = Math.pow(10,2) * Math.PI;
        assertEquals(result,sc.get(0).getField(),0);
    }

    @Test
    public void testCalculateSquareField() {
        System.out.println(ct.purple("Testing calculating field of square"));
        ShapeCollector sc = new ShapeCollector();
        sc.add(new Square(5));
        assertEquals(25 ,sc.get(0).getField(),0);
    }

    @Test
    public void testCalculateTrangleField() {
        System.out.println(ct.purple("Testing calculating field of Triangle"));
        ShapeCollector sc = new ShapeCollector();
        sc.add(new Triangle(3,4,5));
        assertEquals(6 ,sc.get(0).getField(),0);
    }
}
