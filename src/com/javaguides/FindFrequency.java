package com.javaguides;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};
        findFreq(arr);
    }

    public static void findFreq(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (!visited[j] && arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println("Element " + arr[i] + " occurs " + count + " time(s)");
            visited[i] = true;
        }

    }

    public static void findFrequency(int[] arr) {
        Map<Integer, Integer> freqMap = new LinkedHashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " time(s)");
        }
    }
}
