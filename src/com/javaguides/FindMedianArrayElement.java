package com.javaguides;

import java.util.Arrays;

public class FindMedianArrayElement {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 7, 4, 6, 8, 9, 10};
        double medianElement = medianElement(arr);
        System.out.println(medianElement);
    }

    public static double medianElement(int[] arr) {
        sort(arr);
        int size = arr.length;
        double median = 0;
        if (size % 2 == 0) {
            median = (double) (arr[size / 2 - 1] + arr[size / 2]) / 2;
        } else {
            median = (double) arr[size / 2];
        }
        System.out.println(Arrays.toString(arr));
        return median;
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}


