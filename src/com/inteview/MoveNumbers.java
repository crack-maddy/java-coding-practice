package com.inteview;

import java.util.Arrays;

public class MoveNumbers {
    public static void main(String[] args) {
        int[] arr = {10, -4, -2, 0, 1, 3, -2};
        System.out.println(Arrays.toString(moveNumsInPlace(arr)));
        ;
    }


    public static int[] moveNumsInPlace(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            while (start <= end && arr[start] < 0) {
                start++;
            }
            while (start <= end && arr[end] >= 0) {
                end--;
            }
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        return arr;
    }


    public static int[] moveNums(int[] arr) {
        int[] resultArr = new int[arr.length];
        int index = 0;
        for (int num : arr) {
            if (num < 0) {
                resultArr[index++] = num;
            }
        }
        for (int num : arr) {
            if (num >= 0) {
                resultArr[index++] = num;
            }
        }
        return resultArr;

    }
}
