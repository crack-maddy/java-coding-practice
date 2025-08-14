package ytcoding;

import java.util.Arrays;

public class MoveNumbers {
    public static void main(String[] args) {
        int[] arr = {-1, -20, 30, 40, 50, -8};
        int[] resultArr = moveNegativesToLeft(arr);
        System.out.println(Arrays.toString(resultArr));
    }

    public static int[] moveNegativesToLeft(int[] arr) {
        int negativePos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i != negativePos) {
                    int temp = arr[negativePos];
                    arr[negativePos] = arr[i];
                    arr[i] = temp;
                }
                negativePos++;
            }
        }
        return arr;

    }

    public static int[] movePositions(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            while (left <= right && arr[left] < 0) {
                left++;
            }
            while (left <= right && arr[right] >= 0) {
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
