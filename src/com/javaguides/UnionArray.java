package com.javaguides;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};
        System.out.println(Arrays.toString(findUnion(arr1,arr2)));
    }

    public static int[] findUnion(int[] a1, int[] a2) {
        Set<Integer> set = new HashSet<>();
        for (int num : a1) {
            set.add(num);
        }
        for (int num : a2) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int index = 0;

        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }
}
