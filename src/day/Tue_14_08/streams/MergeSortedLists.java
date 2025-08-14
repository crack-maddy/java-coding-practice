package day.Tue_14_08.streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeSortedLists {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 3, 5);
        List<Integer> l2 = Arrays.asList(2, 4, 6);
        mergeSortedLists(l1, l2).forEach(System.out::println);
    }

    public static List<Integer> mergeSortedLists(List<Integer> l1, List<Integer> l2) {
        List<Integer> mergeList = Stream.concat(l1.stream(), l2.stream())
                .sorted().toList();
        return mergeList;
    }
}
