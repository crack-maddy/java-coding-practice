package com.inteview;

public class CharSort {
    public static void main(String[] args) {
        String input = "madhav hi ponnana akkivalasa bhadri bhadra";
        System.out.println(sortWords(input));
    }

    public static String sortWords(String str) {
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        for (String word : words) {
            sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }

    public static String sort(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] > ch[j]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        return new String(ch);
    }
}
