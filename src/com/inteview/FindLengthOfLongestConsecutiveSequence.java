package com.inteview;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindLengthOfLongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(findLength(nums));
    }

    public static int findLength(int[] arr) {
        int[] sortedArr = Arrays.stream(arr)
                .distinct()
                .sorted()
                .toArray();
        return IntStream.range(0, sortedArr.length)
                .mapToObj(i -> {
                    int sequnce = 1;
                    while (i + 1 < sortedArr.length && sortedArr[i + 1] == sortedArr[i] + 1) {
                        i++;
                        sequnce++;
                    }
                    return sequnce;
                })
                .max(Integer::compare)
                .orElse(0);
    }
}
