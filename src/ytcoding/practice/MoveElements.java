package ytcoding.practice;

import java.util.Arrays;

public class MoveElements {
    public static void main(String[] args) {
        int[] arr = {-1,0,23,15,110,-100,-12,12};
        System.out.println(Arrays.toString(moveNegativeElementsToStart(arr)));
    }

    public static int[] moveNegativeElementsToStart(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            while (arr[start] < 0) {
                start++;
            }
            while (arr[end] >= 0) {
                end--;
            }
            if (start < end) {
                int tmep = arr[start];
                arr[start] = arr[end];
                arr[end] = tmep;
            }
        }
        return arr;
    }
}
