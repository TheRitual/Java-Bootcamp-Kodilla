package com.kodilla.testing.calculator;

public class Calculator {
    public static int add(int numberA, int numberB) {
        return numberA + numberB;
    }

    public static int add(String numberA, String numberB) {
        int numa = stringToInt(numberA);
        int numb = stringToInt(numberB);
        return add(numa, numb);
    }

    public static int substract(int numberA, int numberB) {
        return numberA - numberB;
    }

    public static int substract(String numberA, String numberB) {
        int numa = stringToInt(numberA);
        int numb = stringToInt(numberB);
        return substract(numa, numb);
    }

    private static int stringToInt(String number) {
        int numb = 0;
        try {
            numb = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("Arguments must be a number!\n" + e);
        }
        return numb;
    }

}
