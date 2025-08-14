package day.Tue_14_08.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindStringsStartWithNumber {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","1banana","2orange","grape");
        findStringStartWithNumberStreams(words).forEach(System.out::println);
    }

    public static List<String> findStringStartWithNumberStreams(List<String> words) {
        return words.stream()
                .filter(word -> !word.isEmpty() && Character.isDigit(word.charAt(0))).toList();
    }

    public static List<String> findStringStartWithNumber(List<String> words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (Character.isDigit(word.charAt(0))) {
                result.add(word);
            }
        }
        return result;
    }
}
