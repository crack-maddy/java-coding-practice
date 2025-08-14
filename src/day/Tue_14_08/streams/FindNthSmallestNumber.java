package day.Tue_14_08.streams;

import java.util.Arrays;
import java.util.List;

public class FindNthSmallestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 76, 24, 12, 12, 12, 34);
        int[] arr = {3, 76, 24, 12, 12, 12, 34};
        System.out.println(findSmallestNo(arr, 3));
    }

    public static int findSmallestNo(List<Integer> list, int target) {
        return list.stream()
                .sorted()
                .distinct()
                .skip(target - 1)
                .limit(1)
                .findFirst().
                orElse(0);
    }

    public static int findSmallestNo(int[] arr, int target) {
        return Arrays.stream(arr)
                .boxed()
                .sorted()
                .distinct()
                .skip(target - 1)
                .limit(1)
                .findFirst().
                orElse(0);
    }
}
