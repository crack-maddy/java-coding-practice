package com.javaguides;

public class SortStringArray {
    public static void main(String[] args) {
        String[] arr ={"dog", "cat","cap", "elephant", "bear"};
        sortStrArr(arr);
        for(String name : arr){
            System.out.println(name);
        }
    }

    public static void sortStrArr(String[] strs) {
        int start = 0;
        int end = strs.length - 1;
        for (int i = 0; i < strs.length - 1; i++) {
            for (int j = i + 1; j < strs.length; j++) {
                if (strs[i].compareTo(strs[j]) > 0) {
                    String temp = strs[i];
                    strs[i] = strs[j];
                    strs[j] = temp;
                }
            }
        }
    }

}


