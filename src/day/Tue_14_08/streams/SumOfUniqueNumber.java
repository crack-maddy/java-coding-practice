package day.Tue_14_08.streams;

import java.util.Arrays;
import java.util.List;

public class SumOfUniqueNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,1,2,2,2,3,3,4,5,6,6);
        System.out.println(findSumOfUniqueNumbers(list));
        System.out.println(findSumOfUniqueNumbersReduce(list));
    }

    public static int findSumOfUniqueNumbers(List<Integer> list) {
        return list.stream()
                .distinct()
                .mapToInt(Integer::intValue)
                .sum();
    }


    public static int findSumOfUniqueNumbersReduce(List<Integer> list) {
        return list.stream()
                .distinct()
                .reduce(0, (a, b) -> a + b);
    }
}
