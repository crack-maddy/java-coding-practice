package com.javaguides;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        //complete reverse array
        reverse(arr, 0, n - 1);

        //rotate k no times
        reverse(arr, 0, k - 1);

        //reverse remaining array
        reverse(arr, k, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
