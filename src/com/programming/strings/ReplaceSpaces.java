package com.programming.strings;

public class ReplaceSpaces {
    public static void main(String[] args) {
        System.out.println(replaceSpaces("Hello World to Java Programming"));
    }
    public static String replaceSpaces(String str){
        return str.replaceAll("\\s+","%20");
    }
}
