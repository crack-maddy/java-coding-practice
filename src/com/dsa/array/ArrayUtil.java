package com.dsa.array;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayUtil {

    //move zeros to end
    public static int[] moveZeros(int[] arr) {
        int nonZeroPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroPos++] = arr[i];
            }
        }
        while (nonZeroPos < arr.length) {
            arr[nonZeroPos++] = 0;
        }
        return arr;
    }

    //find index of an element
    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //check if given array is sorted or not
    public static boolean isSorted(int[] arr) {
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
            }
        }
        return isSorted;
    }

    //rotate an array to the right by k elements

    public static void rotate(int[] arr, int k) {
        k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        System.out.println(Arrays.toString(arr));
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

    //find duplicate numbers in array
    public static void findDuplicatesHS(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) { // If num is already in seen, it's a duplicate
                duplicates.add(num); // Add to duplicates set
            }
        }
        System.out.println(duplicates);

    }

    public static void findDuplicates(int[] arr) {
        boolean hasDuplicates = false;

        //compare each element with sub-sequent element
        for (int i = 0; i < arr.length; i++) {
            //check if current element is already identified as a duplicate
            boolean isAlreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    isAlreadyPrinted = true;
                    break;
                }
            }
            //if not already printed, check for duplicates
            if (!isAlreadyPrinted) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println(arr[i]);
                        hasDuplicates = true;
                        break;
                    }
                }
            }
        }
        if (!hasDuplicates)
            System.out.println("No Duplicates found");
    }

    //merge two sorted arrays
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }
        return merged;
    }

    //find missing number
    public static int findMissing(int[] arr) {
        int n = arr.length;
        int expectSum = (n + 1) * (n + 2) / 2;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return expectSum - sum;

    }

    //find second-largest element
    public static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    //reverse array
    public static int[] reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    //find max element in array
    public static int maxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //sum of all numbers
    public static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}

