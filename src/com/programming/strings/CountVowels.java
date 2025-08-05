package com.programming.strings;

public class CountVowels {
    public static void main(String[] args) {
        System.out.println(countVowelsStream("Hello World"));
    }

    public static long countVowelsStream(String str){
        return str.toLowerCase()
                .chars()
                .filter(ch -> "aeiou".indexOf(ch) != -1)
                .count();
    }

    public static int countVowels(String str) {
        if (str == null) return 0;
        int count = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
