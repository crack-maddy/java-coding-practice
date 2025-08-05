package com.programming.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamJoin {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(5,6,7,8);
        Stream<Integer> stream = Stream.concat(list1.stream(), list2.stream());
        stream.forEach(System.out::println);
    }
}
