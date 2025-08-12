package com.javaguides;

import java.util.Arrays;

public class SeparateEvensOdds {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] resultArr = separateEventOdds(arr);
        System.out.println(Arrays.toString(resultArr));
//        separateEvenOdd(arr);
//        System.out.println(Arrays.toString(arr));
    }

    public static int[] separateEventOdds(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int[] result = new int[arr.length];
        for (int num : arr) {
            if (num % 2 == 0) {
                result[start++] = num;
            } else {
                result[end--] = num;
            }
        }
        return result;
    }

    public static void separateEvenOdd(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }
            while (arr[right] % 2 != 0 && left < right) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static int[] separateEvenOddNums(int[] arr) {
        int[] resultArr = new int[arr.length];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                resultArr[counter] = arr[i];
                counter++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                resultArr[counter] = arr[i];
                counter++;
            }
        }
        return resultArr;
    }

}
