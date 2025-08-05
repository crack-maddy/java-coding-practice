package com.programming.strings;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindromeStream("A man, a plan, a canal: Panama"));
    }

    public static boolean palindromeStream(String str) {
        str = str.toLowerCase().replaceAll("[^a-z0-9]","");
        return str.equals(
                str.chars()
                        .mapToObj(ch -> String.valueOf((char) ch))
                        .reduce("", (reversed, ch) -> ch + reversed));
    }

    public static boolean palindrome(String str) {
        if (str == null) return false;
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start++) != str.charAt(end--))
                return false;
        }
        return true;
    }
}
