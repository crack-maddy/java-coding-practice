package com.javaguides;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(121));
    }

    public static boolean isArmstrong(int num) {
        int temp = num;
        int length = String.valueOf(num).length();
        int count = 0;
        while (temp != 0) {
            int digit = temp % 10;
            temp /= 10;
            count = count + (int) Math.pow(digit, length);
        }
        return num == count;
    }
}
