package day.Tue_14_08.streams;

import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> words = List.of("apple","banana","apple","orange","banana");
        for(String word: removeDuplicatesAndPreserveOrder(words)){
            System.out.println(word);
        }
    }

    public static List<String> removeDuplicatesAndPreserveOrder(List<String> list) {
        return list.stream().distinct().sorted().toList();
    }
}
