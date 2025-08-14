package day.Tue_14_08.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StreamUtil {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(isContainDuplicates1(arr));
    }

    public static boolean isContainDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        return Arrays.stream(arr)
                .anyMatch(ele -> !set.add(ele));
    }

    public static boolean isContainDuplicates1(int[] arr) {
       return Arrays.stream(arr)
               .distinct()
               .count() != arr.length;
    }
}
