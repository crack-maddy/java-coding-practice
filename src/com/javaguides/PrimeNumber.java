package com.javaguides;

public class PrimeNumber {
    public static void main(String[] args) {
        findPrimes(10,30);
    }

    public static void findPrimes(int start, int end){
        for(int i = start;i<=end;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
