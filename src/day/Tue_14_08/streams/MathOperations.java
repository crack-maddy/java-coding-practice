package day.Tue_14_08.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;

public class MathOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        mathOps(list);
        System.out.println(" ");
        mathOps2(list);
    }

    public static void mathOps2(List<Integer> list) {
        IntSummaryStatistics statistics = list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        //minimum number
        System.out.println("Minimum Number: " + statistics.getMax());

        //maximum number
        System.out.println("Maximum Number: " + statistics.getMin());

        //sum of all numbers
        System.out.println("Sum of all numbers: " + statistics.getSum());

        //average
        System.out.println("Average: " + statistics.getAverage());

        //count of numbers
        System.out.println("Count of numbers: " + statistics.getCount());


    }
    public static void mathOps(List<Integer> list) {
        //minimum number
        System.out.println("Minimum Number: " + list.stream().min(Comparator.comparing(Integer::intValue)).get());

        //maximum number
        System.out.println("Maximum Number: " + list.stream().max(Comparator.comparingInt(Integer::intValue)).get());

        //sum of all numbers
        System.out.println("Sum of all numbers: " + list.stream().mapToInt(Integer::intValue).sum());

        //average
        System.out.println("Average: " + list.stream().mapToInt(Integer::intValue).average().getAsDouble());

        //count of numbers
        System.out.println("Count of numbers: " + list.stream().count());


    }
}
