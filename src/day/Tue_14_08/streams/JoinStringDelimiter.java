package day.Tue_14_08.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringDelimiter {
    public static void main(String[] args) {
        List<String> words = List.of("apple","banana","orange","mango");
        System.out.println(joinStringsList(words));
    }

    public static String joinStrings(List<String> list){
        return list.stream().collect(Collectors.joining(",","[","]")).trim();
    }
    public static List<String> joinStringsList(List<String> list){
        return list.stream()
                .map(word ->  String.join(word, "[","]"))
                .collect(Collectors.joining(","))
                .lines().toList();
    }
}
