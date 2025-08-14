package day.Tue_14_08.streams;

import java.util.Arrays;

public class FindLastElement {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(findLastElement(arr));
    }

    public static int findLastElement(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .skip(arr.length - 1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("empty array"));
    }
}
