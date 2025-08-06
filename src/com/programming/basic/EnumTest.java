package com.programming.basic;

import java.util.Arrays;

public class EnumTest {
    public static void main(String[] args) {
//        for(Day value: Day.values()){
//            System.out.println(value);
//        }

//        for (int i = 0; i < Day.values().length; i++) {
//            System.out.println(Day.values()[i]);
//        }

        Arrays.stream(Day.values()).forEach(System.out::println);
    }
}

enum Day{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
