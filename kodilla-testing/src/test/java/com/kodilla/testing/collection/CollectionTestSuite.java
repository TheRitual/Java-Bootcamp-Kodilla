package com.kodilla.testing.collection;

import com.kodilla.utilities.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionTestSuite {
    private ColorizeText ct = new ColorizeText(true);
    //empty list test
    @Before
    public void before() {
        System.out.println(ct.cyan("TEST CASE BEGIN:"));
    }

    @After
    public void after() {
        System.out.println(ct.cyan(":TEST CASE END"));
    }

    @Test
    public void testEmptyArray() {
        System.out.println(ct.purple("Testing Empty Array"));
        List<Integer> empty = new ArrayList<>();
        List<Integer> result = OddNumbersExterminator.exterminate(empty);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testRandomNumbersArray() {
        System.out.println(ct.purple("Testing Random Numbers Array"));
        Random gen = new Random();
        List<Integer> generated = new ArrayList<>();
        for(int i = 0; i < 100 ; i++) {
            generated.add(gen.nextInt(999));
        }
        List<Integer> result = OddNumbersExterminator.exterminate(generated);
        result.forEach(System.out::println);
    }

}
