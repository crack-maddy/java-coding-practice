package com.javaguides;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNum(123));
    }

    public static int reverseNum(int num){
        int reverse =0;
        while(num != 0){
            int digit = num% 10;
            num /=10;
            reverse = digit + reverse*10;
        }
        return reverse;
    }
}
