package com.inteview;
//reverse only characters, special characters are not reversed.
public class ReverseCharacters {
    public static void main(String[] args) {
        String str = "a,b$c,ddd";
        System.out.println(reverseChars(str));
    }

    public static String reverseChars(String str) {
        char[] ch = str.toCharArray();
        int start = 0;
        int end = ch.length - 1;

        while (start < end) {
            if (!Character.isLetter(ch[start])) {
                start++;
                continue;
            } else if (!Character.isLetter(ch[end])) {
                end--;
            } else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return new String(ch);
    }
}
