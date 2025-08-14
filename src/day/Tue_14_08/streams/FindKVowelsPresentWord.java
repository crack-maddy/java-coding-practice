package day.Tue_14_08.streams;

import java.util.Arrays;
import java.util.List;

public class FindKVowelsPresentWord {
    public static void main(String[] args) {
        String str = "I have an apple and orange on the table";
        findKVowelsWords(str,2).forEach(System.out::println);
    }

    public static List<String> findKVowelsWords(String str, int k) {
        return Arrays.stream(str.split("\\s+"))
                .filter(word -> countVowels(word) == k)
                .toList();
    }

    public static long countVowels(String str) {
        return str.chars()
                .mapToObj(ch -> (char) ch)
                .filter(ch -> "aeiouAEIOU".indexOf(ch) != -1)
                .count();
    }
}
