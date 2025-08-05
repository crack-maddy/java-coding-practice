package com.programming.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","apple","orange","banana");
        List<String> uniqueList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueList);
    }
}
