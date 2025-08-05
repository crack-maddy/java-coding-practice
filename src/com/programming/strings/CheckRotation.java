package com.programming.strings;

public class CheckRotation {
    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle","erbottlewat"));
    }

    public static boolean isRotation(String s1, String s2) {
        s1 = s1 + s2;
        return s1.contains(s2);
    }
}
