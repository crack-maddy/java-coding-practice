package com.inteview;

public class LongestWord {

    public static void main(String[] args) {
        String str = "java is powerful and homogeneous versatile";
        System.out.println(findLongestWord(str));
    }

    public static String findLongestWord(String str) {
        String[] strs = str.split("\\s+");

        String longest = "";

        for (String word : strs) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

}
