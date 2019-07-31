package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[20];
        Random gen = new Random();
        IntStream.range(0,20).forEach(x -> numbers[x] = gen.nextInt(100));

        //When
        double result = new Averager().getAverage(numbers);
        double avr = 0;
        for(int i = 0; i < 20; i++) {
            avr += numbers[i];
        }
        avr = avr/20d;

        //Then
        Assert.assertEquals(avr, result, 0);
    }
}
