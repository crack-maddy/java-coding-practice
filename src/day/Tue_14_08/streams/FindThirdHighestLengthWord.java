package day.Tue_14_08.streams;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindThirdHighestLengthWord {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "kiwi", "mango", "orange");
//        System.out.println(findThirdHighestLengthWord(words));

        words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingLong(String::length)))
                .entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + "    " + entry.getValue()));
    }

    public static String findThirdHighestLengthWord(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .skip(2)
                .limit(1)
                .findFirst().orElse(null);
    }
}
