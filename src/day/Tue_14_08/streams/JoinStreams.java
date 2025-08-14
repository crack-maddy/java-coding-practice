package day.Tue_14_08.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JoinStreams {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(4, 5, 6);
        joinStreams(l1,l2).forEach(System.out::println);
    }

    public static Stream<Integer> joinStreams(List<Integer> list1, List<Integer> list2) {
        Stream<Integer> concatStream = Stream.concat(list1.stream(), list2.stream());
        return concatStream;
    }
}
