package com.programming.strings;

public class CheckSubstring {
    public static void main(String[] args) {
        System.out.println(containSubstring("Hello World to spring boot", "spring  "));
    }
    public static boolean containSubstring(String str, String sub){
        sub = sub.trim();
        return str.contains(sub);
    }
}
