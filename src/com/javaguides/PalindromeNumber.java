package com.javaguides;

public class PalindromeNumber {
    public static void main(String[] args) {
        boolean isPalindrome = isPalindrome(122);
        if(isPalindrome)
            System.out.println("Palindrome Number");
        else
            System.out.println("It is not Palindrome");
    }

    public static boolean isPalindrome(int num) {
        int temp = num;
        int reverse = 0;
        while (temp != 0) {
            int digit = temp % 10;
            temp /= 10;
            reverse = digit + reverse * 10;
        }
        return reverse == num;
    }
}
