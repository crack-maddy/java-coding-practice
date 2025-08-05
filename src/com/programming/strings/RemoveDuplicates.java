package com.programming.strings;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicatesStream("hello madhav"));
    }

    public static String removeDuplicatesStream(String str){
       return str.chars()
                .distinct()
                .mapToObj(ch -> String.valueOf((char)ch))
                .collect(Collectors.joining());

    }

    public static String removeDuplicatesSet(String str){
        Set<Character> set = new LinkedHashSet<>();
        for(char c: str.toCharArray()){
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for(Character c: set){
            sb.append(c);
        }
        return sb.toString();
    }

    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256];
        for (char ch : str.toCharArray()) {
            if (!seen[ch]) {
                seen[ch] = true;
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
