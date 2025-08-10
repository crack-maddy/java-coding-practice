package com.dsa.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayClient {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 5, 0, 2};
        System.out.println(Arrays.toString(ArrayUtil.moveZeros(arr)));
    }

}
