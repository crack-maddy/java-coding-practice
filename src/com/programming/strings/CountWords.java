package com.programming.strings;

import java.util.Arrays;

public class CountWords {
    public static void main(String[] args) {
        System.out.println(countWordsStream("Madhava   Ponnana  "));
    }

    public static long countWordsStream(String str){
        return Arrays.stream(str.trim().split("\\s+"))
                .filter(word -> !word.isEmpty())
                .count();
    }

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
