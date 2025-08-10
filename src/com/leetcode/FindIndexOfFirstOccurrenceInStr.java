package com.leetcode;

public class FindIndexOfFirstOccurrenceInStr {
    public static void main(String[] args) {
        System.out.println(firstOccurrence("sadbutsad","uts"));
    }


    /*
     Example 1:
        Input: haystack = "sadbutsad", needle = "sad"
        Output: 0
        Explanation: "sad" occurs at index 0 and 6.
        The first occurrence is at index 0, so we return 0.
     Example 2:
        Input: haystack = "leetcode", needle = "leeto"
        Output: -1
        Explanation: "leeto" did not occur in "leetcode", so we return -1.
     */
    public static int firstOccurrence(String haystack, String needle) {
        if (haystack.isEmpty())
            return 0;
        if (haystack.length() < needle.length())
            return -1;

        // Iterate through possible starting points in haystack
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Check if substring starting at i matches needle
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
