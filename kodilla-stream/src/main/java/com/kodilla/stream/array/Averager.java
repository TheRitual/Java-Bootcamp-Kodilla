package com.kodilla.stream.array;

import java.util.stream.IntStream;

public class Averager implements ArrayOperations{
    public static double calculateAverage(int[] numbers) {
        IntStream.range(0,numbers.length).forEach(n -> System.out.print(numbers[n] + " "));
        System.out.println();
        return IntStream.range(0,numbers.length).map(i -> numbers[i]).average().getAsDouble();
    }

    public double getAverage(int[] numbers) {
        return calculateAverage(numbers);
    }
}
