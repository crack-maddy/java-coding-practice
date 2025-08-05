package com.programming.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,3,5,7);
        List<Integer> l2 = Arrays.asList(2,4,6,8);
        List<Integer> mergedSortedLit = Stream.concat(l1.stream(), l2.stream())
                .sorted()
                .toList();
//                .reversed(); //reversed the order
        System.out.println(mergedSortedLit);
    }
}
