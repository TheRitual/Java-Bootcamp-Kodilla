package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public static ArrayList<Integer> exterminate(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList();
        list.stream()
                .filter(n -> n % 2 == 0).forEach(n -> result.add(n));
        return  result;
    }
}
