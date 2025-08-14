package day.Tue_14_08.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseDecimalList {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(2.13,3.19,1.12,1.65,1.32);
        reverseDecimals(list).forEach(System.out::println);
    }
    public static List<Double> reverseDecimals(List<Double> list){
        return list.stream().sorted(Comparator.reverseOrder()).toList();
    }

}
