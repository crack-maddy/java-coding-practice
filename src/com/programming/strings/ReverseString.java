package com.programming.strings;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseStream("Madhav"));
    }

    public static String reverseStream(String str){
        return str.chars()
                .mapToObj(ch -> String.valueOf((char) ch))
                .reduce("", (reversed, ch) -> ch + reversed);
    }

    public static String reverseFor(String str){
        char[] chars = str.toCharArray();
        for(int i = 0,j= chars.length-1; i< j; i++,j--){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }

    public static String reverseSB(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String reverse(String str){
        char[] chars = str.toCharArray();
        int start  = 0;
        int end = chars.length-1;

        while(start < end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] =temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}
