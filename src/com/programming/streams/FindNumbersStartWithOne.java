package com.programming.streams;

import java.util.Arrays;
import java.util.List;

public class FindNumbersStartWithOne {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,21,13,41,15,2,1,100,23);
        List<Integer> list = numbers.stream()
                .filter(num -> String.valueOf(num).startsWith("1"))
                .toList();
        System.out.println(list);
    }
}
