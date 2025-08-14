package day.Tue_14_08.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IsContainPrimeNums {
    public static void main(String[] args) {
        System.out.println(isContainPrime(List.of(4, 6, 9)));
    }

    public static boolean isContainPrime(List<Integer> list) {
        return list.stream().anyMatch(e -> isPrimeStream(e));
    }

    public static List<Integer> findPrimes(int start, int end) {
        List<Integer> primeList = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeList.add(i);
            }
        }
        return primeList;
    }

    public static boolean isPrimeStream(int num) {
        if (num < 2) {
            return false;
        }
        return IntStream
                .rangeClosed(2, (int) Math.sqrt(num))
                .noneMatch(i -> num % i == 0);
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
