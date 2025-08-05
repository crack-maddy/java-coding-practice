package com.programming.streams;

public class PrimeCheck {
    public static void main(String[] args) {
        System.out.println(isPrime(8));
    }
    public static boolean isPrime(int num){
        if(num <= 1) return false;
        System.out.println(Math.sqrt(num));
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num  % i ==0)
                return false;
        }
        return true;
    }
}
