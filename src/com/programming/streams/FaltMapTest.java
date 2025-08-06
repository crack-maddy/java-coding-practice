package com.programming.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FaltMapTest {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("Hello World","Spring Boot","Hi Madhav Ponnana");
//        list.stream().flatMap(l -> Arrays.stream(l.split(" ")))
//                .collect(Collectors.toList()).forEach(System.out::println);

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );

       List<List<Integer>> list1 = listOfLists.stream()
               .map(lt -> lt.stream().map(n -> n*2).toList())
               .toList();
       List<Integer> list2 = listOfLists.stream().flatMap(lt -> lt.stream().map(n->n*2)).toList();

        System.out.println(list1);
        System.out.println(list2);

        Integer sum = list2.stream().reduce(0, (a, b) -> a + b);
        System.out.println("sum: "+sum);

        List<Integer> numList = Arrays.asList(34,12,32,54,18,76,234);
        List<Integer> reverseList = numList.stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println("Reverse");
        System.out.println(reverseList);

    }
}
