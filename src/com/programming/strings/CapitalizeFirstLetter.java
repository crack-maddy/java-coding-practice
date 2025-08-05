package com.programming.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        System.out.println(capitalizeWordStream("hello sPRING boot world"));
    }

    public static String capitalizeWordStream(String str) {
        return Arrays.stream(str.trim().split("\\s+"))
                .map(s -> Character.toUpperCase(s.charAt(0)) +
                        s.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }

    public static String capitalizeWord(String str) {
        String[] words = str.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return sb.toString().trim();
    }
}
