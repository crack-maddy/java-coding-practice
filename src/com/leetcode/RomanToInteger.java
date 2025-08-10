package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int count = 0;
        int prev = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            int curr = map.get(s.charAt(i));
            if(curr >= prev){
                count += curr;
            }else{
                count -= curr;
            }
            prev = curr;
        }
        return count;

        //prev = 1000
        //count = 994+1000=1994
        //curr=1000
    }
}
