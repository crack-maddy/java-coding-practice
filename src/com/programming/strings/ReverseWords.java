package com.programming.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWordsStreamNew("Hi Madhav Ponnana"));
    }


    public static String reverseWordsStreamNew(String str){
        return Arrays.stream(str.trim().split("\\s+"))
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            return list.stream().collect(Collectors.joining(" "));
                        }
                ));
    }

    public static String reverseWordsStream(String str){
        return Arrays.stream(str.trim().split("\\s+"))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
    }

    public static String reverseWordsNew(String str){
        String[] words = str.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i= words.length -1;i>=0;i--){
            sb.append(words[i]).append(" ");
        }
        return sb.toString();
    }

    public static String reverseWords(String input) {
        String[] words = input.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            String reverse = reverse(word);
            sb.append(reverse).append(" ");
        }
        return sb.toString();
    }

    public static String reverse(String str) {
        char[] ch = str.toCharArray();
        int start = 0, end = ch.length - 1;
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return new String(ch);
    }
}
