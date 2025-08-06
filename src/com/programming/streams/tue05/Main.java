package com.programming.streams.tue05;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(findLongestWord("Hello World to SpringBoot Microservices"));
    }

    //find the longest word in string
    public static String findLongestWord(String str){
        return Arrays.stream(str.split("\\s+"))
                .max(Comparator.comparing(String::length)).orElse(null);
    }

    //remove vowels from a string
    public static String removeVowels(String str) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U');
        return str.chars().mapToObj(ch -> (char) ch)
                .filter(c -> !vowels.contains(c))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }


    //check two strings are anagrams
    public static boolean isAnagram(String s1, String s2) {
        s1 = s1.trim().replaceAll("\\s+", "");
        s2 = s2.trim().replaceAll("\\s+", "");
        return Arrays.equals(s1.chars().sorted().toArray(), s2.chars().sorted().toArray());
    }

    //reverse string using streams
    public static String reverseString(String str) {
        return str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                    Collections.reverse(list);
                    return list.stream();
                }))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    //find first non-repeated character in string
    public static Character findFirstNonRepeated(String str) {
        return str.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse(null);
    }

    //count occurrence of each word in string
    public static void countWordOccurrences(String str) {
        Arrays.stream(str.trim().toLowerCase().split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " " + v));

    }

    //count duplicates
    public static long countDuplicates(String str) {
        return str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .count();
    }
}


