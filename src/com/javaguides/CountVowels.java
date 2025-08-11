package com.javaguides;

public class CountVowels {
    public static void main(String[] args) {
        System.out.println(countVowels("madhav aeiou"));;
    }

    public static int countVowels(String str) {
        char[] ch = str.toLowerCase().toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                count++;
            }
        }
        return count;
    }
}
