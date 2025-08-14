package ytcoding;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        //move zeros to end of the array
        int[] arr = {0, 10, 0, 0, 20, 0, 0, 40, 50, 60, -12};
        System.out.println(Arrays.toString(moveZerosToEnd2(arr)));
    }

    public static int[] moveZerosToEnd2(int[] arr) {
        if (arr.length == 0 || arr == null) {
            return arr;
        }
        int nonZeroPos = 0;

        //move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroPos++] = arr[i];
            }
        }

        //fill the rest with zero's
        while (nonZeroPos < arr.length) {
            arr[nonZeroPos++] = 0;
        }
        return arr;
    }

    public static int[] moveZerosToEnd(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (arr[left] > 0) {
                left++;
            }
            while (arr[right] == 0) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        return arr;
    }
}
