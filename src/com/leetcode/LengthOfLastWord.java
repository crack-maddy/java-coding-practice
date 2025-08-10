package com.leetcode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lastWordLength2("luffy is still joyboy"));
    }

    public static int lastWordLength(String s){
        String[] words = s.trim().split("\\s+");
        return words[words.length-1].length();
    }

    public static int lastWordLength2(String s){
        s = s.trim();

        // Find the index of the last space
        int lastSpaceIndex = s.lastIndexOf(' ');

        // Return length of substring after last space
        return s.length() - lastSpaceIndex - 1;
    }
}
