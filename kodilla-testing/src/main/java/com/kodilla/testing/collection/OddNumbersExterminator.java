package com.kodilla.testing.collection;

import java.util.List;
import java.util.stream.Collectors;

public class OddNumbersExterminator {
    public static List<Integer> exterminate(List<Integer> list) {
        return list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }
}
