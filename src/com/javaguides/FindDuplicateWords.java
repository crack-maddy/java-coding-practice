package com.javaguides;

import com.leetcode.LengthOfLastWord;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicateWords {
    public static void main(String[] args) {
        findDuplicates("Madhav Ponnana Madhav Ponnana Madhav Ponnana madhav Akkivalasa akkivalasa");
    }

    public static void findDuplicates(String str){
        String[] strs = str.toLowerCase().split("\\s+");
        Map<String, Integer> map = new LinkedHashMap<>();
        for(int i=0;i<strs.length;i++){
            map.put(strs[i],map.getOrDefault(strs[i],0)+1);
        }
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey()+" - "+entry.getValue());
            }
        }
    }

    public static void findDuplicatesBF(String str) {
        String[] strs = str.toLowerCase().split("\\s+");
        boolean hasDuplicates = false;
        for (int i = 0; i < strs.length; i++) {
            boolean isAlreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (strs[i].equals(strs[k])) {
                    isAlreadyPrinted = true;
                    break;
                }
            }
            if (!isAlreadyPrinted) {
                for (int j = i + 1; j < strs.length; j++) {
                    if (strs[i].equals(strs[j])) {
                        System.out.println(strs[i]);
                        hasDuplicates = true;
                        break;
                    }
                }
            }
        }
        if (!hasDuplicates) {
            System.out.println("No Duplicates");
        }
    }
}
