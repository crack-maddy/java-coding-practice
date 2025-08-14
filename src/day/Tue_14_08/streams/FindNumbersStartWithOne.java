package day.Tue_14_08.streams;

import java.util.List;

public class FindNumbersStartWithOne {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 11, 23, 34, 71, 19,1,12,11);
        findAllNumbersStartWithOne(numbers).forEach(System.out::println);
    }

    public static List<Integer> findAllNumbersStartWithOne(List<Integer> numbers) {
        return numbers
                .stream()
                .filter(num -> String.valueOf(num).startsWith("1"))
                .toList();
    }

}
