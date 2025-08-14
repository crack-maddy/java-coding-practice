package day.Tue_14_08.streams;

import java.util.List;

public class StreamPeekDebug {
    public static void main(String[] args) {
        List<String> words = List.of("rose","apple","orange","lotus","ant");
        usingPeek(words).forEach(System.out::println);
    }

    public static List<String> usingPeek(List<String> words) {
        return words
                .stream()
                .peek(word -> System.out.println("Original: " + word))
                .filter(word -> word.startsWith("a"))
                .peek(word -> System.out.println("After: " + word))
                .map(word -> word.toUpperCase())
                .peek(word -> System.out.println("After converting: " + word))
                .toList();
    }
}
