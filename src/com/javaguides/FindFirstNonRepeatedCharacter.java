package com.javaguides;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatedCharacter {
    public static void main(String[] args) {
        System.out.println(findNonRepeatedChar("madhavm"));
    }

    public static char findNonRepeatedChar(String str) {
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        char[] ch = str.toCharArray();
        char result = '\0';
        for (int i = 0; i < ch.length; i++) {
            charMap.put(ch[i], charMap.getOrDefault(ch[i], 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
                break;
            }
        }
        return result;
    }
}
