package com.javaguides;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9};
        int[] result = merge(arr1, arr2);
        for(int num: result)
            System.out.print(num+" ");
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] resultArr = new int[arr1.length + arr2.length];
        int count = 0;
        for (int num : arr1) {
            resultArr[count++] = num;
        }
        for (int num : arr2) {
            resultArr[count++] = num;
        }
        return resultArr;
    }
}
