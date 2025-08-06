package com.inteview;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthString {
    public static void main(String[] args) {
        String[] strs = {"Madhav","Akkivalasa","Srikakulam"};
        System.out.println(findMaxString(strs));
        System.out.println(findMaxStringStream(strs));
    }

    public static String findMaxString(String[] strs){
        String maxLenStr = "";
        for(String str: strs){
            if(str.length() > maxLenStr.length()){
                maxLenStr = str;
            }
        }
        return maxLenStr;
    }
    public static String findMaxStringStream(String[] strs){
        return Arrays.stream(strs).max(Comparator.comparing(String::length)).orElse(null);
    }
}
