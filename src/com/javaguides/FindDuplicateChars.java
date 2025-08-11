package com.javaguides;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicateChars {
    public static void main(String[] args) {
        findDuplicatesBF("programminggg");
    }

    public static void findDuplicatesBF(String str) {
        boolean hasDuplicates = false;
        char[] ch = str.replace(" ", "").toCharArray();
        for (int i = 0; i < ch.length; i++) {
            boolean isAlreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (ch[i] == ch[k]) {
                    isAlreadyPrinted = true;
                    break;
                }
            }
            if (!isAlreadyPrinted) {
                for (int j = i + 1; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        System.out.print(ch[i] + " ");
                        hasDuplicates = true;
                        break;
                    }
                }
            }
        }
    }

    public static void findDuplicates(String str) {
        char[] ch = str.replace("\\s+", "").toCharArray();
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        for (int i = 0; i < ch.length; i++) {
            charMap.put(ch[i], charMap.getOrDefault(ch[i], 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
