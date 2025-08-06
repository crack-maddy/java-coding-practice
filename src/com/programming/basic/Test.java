package com.programming.basic;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream.generate(() -> new Random().nextInt(100))
                .limit(5).sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        Stream.generate(()-> "Hello")
                .limit(3)
                .forEach(System.out::println);
        Stream.iterate(2, n -> n+2)
                .limit(5)
                .forEach(System.out::println);
    }
}
