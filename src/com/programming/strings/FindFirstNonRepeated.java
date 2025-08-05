package com.programming.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeated {
    public static void main(String[] args) {
        System.out.println(findFirstNotRepeatedCharStreams("madgram"));
    }

    public static Character findFirstNotRepeatedCharStreams(String str){
        return str.chars()
                .mapToObj(ch -> (char)ch)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet().stream()
                .filter(entry -> entry.getValue() ==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

    public static Character findFirstNonRepeatCharHM(String str){
        Map<Character, Integer> map = new HashMap<>();
        for( char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(char c : str.toCharArray()){
            if(map.get(c) == 1){
                return c;
            }
        }
        return null;
    }
}
