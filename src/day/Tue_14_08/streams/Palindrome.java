package day.Tue_14_08.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        String input = "madam1";
        System.out.println(isPalindromeStream(input));
    }

    public static boolean isPalindromeStream(String str) {
        return IntStream
                .range(0, str.length() / 2)
                .allMatch(i -> str.charAt(i) == str.charAt(str.length() - 1 - i));
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
       /* char[] ch = str.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        while (start < end) {
            if (ch[start] != ch[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
        */
    }
}
