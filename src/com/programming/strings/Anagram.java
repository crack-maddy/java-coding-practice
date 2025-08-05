package com.programming.strings;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagramCharFreqArray("Listen", "Silent"));
    }

    public static boolean isAnagramCharFreqArray(String s1, String s2) {
        int[] charCount = new int[26];
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        for (int i = 0; i < s1.length(); i++) {
            charCount[s1.charAt(i) - 'a']++;
            charCount[s2.charAt(i) - 'a']--;
        }
        return Arrays.stream(charCount).allMatch(count -> count == 0);

    }

    public static boolean isAnagramCharFrequency(String s1, String s2) {
        Map<Character, Long> freq1 = s1.toLowerCase()
                .chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Character, Long> freq2 = s2.toLowerCase()
                .chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return freq1.equals(freq2);
    }

    public static boolean isAnagramSortArray(String s1, String s2) {
        char[] chars1 = s1.toLowerCase().toCharArray();
        char[] chars2 = s2.toLowerCase().toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }

    public static boolean isAnagramHM(String s1, String s2) {
        Map<Character, Long> charCount = s1.toLowerCase()
                .chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        for (char ch : s2.toLowerCase().toCharArray()) {
            Long count = charCount.get(ch);
            if (count == null || count == 0)
                return false;
            charCount.put(ch, count - 1);
        }
        return charCount.values().stream().allMatch(count -> count == 0);
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) return false;
        String sorted1 = s1.toLowerCase()
                .chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        String sorted2 = s2.toLowerCase()
                .chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return sorted1.equals(sorted2);
    }
}
