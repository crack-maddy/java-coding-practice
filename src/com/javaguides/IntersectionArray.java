package com.javaguides;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        int[] result = intersection(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] intersection(int[] arr1, int[] arr2) {
        sort(arr1);
        sort(arr2);
        List<Integer> intersectionList = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                intersectionList.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] intersectArr = new int[intersectionList.size()];
        int index = 0;
        for (int num : intersectionList) {
            intersectArr[index++] = num;
        }
        return intersectArr;
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
