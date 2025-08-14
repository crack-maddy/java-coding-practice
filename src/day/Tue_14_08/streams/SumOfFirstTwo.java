package day.Tue_14_08.streams;

import java.util.Arrays;
import java.util.List;

public class SumOfFirstTwo {
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(12,13,14,15);
        System.out.println(sumOfFirstTwoUsingReduce(list));
    }

    public static int sumOfFirstTwo(List<Integer> list){
        return list.stream()
                .limit(2)
                .mapToInt(Integer::intValue)
                .sum();
    }
    public static int sumOfFirstTwoUsingReduce(List<Integer> list){
        return list.stream()
                .limit(2)
                .reduce((a,b) -> a+b).get();
    }
}
