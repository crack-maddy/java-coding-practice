package com.javaguides;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseStr("madhav"));
    }

    public static String reverseStr(String str) {
        char[] ch = str.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return new String(ch);
    }
}
