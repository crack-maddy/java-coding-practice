package com.programming.strings;

public class CountOccurrences {
    public static void main(String[] args) {
        System.out.println(countOccurrences("Madhav Ponnana", 'a'));
    }
    public static int countNoOfOccurrences(String input, char c){
        int count = 0;

        for(char ch: input.toCharArray()){
            if(c == ch){
                count++;
            }
        }
        return count;
    }

    public static long countOccurrences(String str, char c){
        return str.chars()
                .filter(ch -> ch == c)
                .count();
    }
}
