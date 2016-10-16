package workhome.buble_sort;

import java.util.Arrays;
import java.util.Random;

public class BubleSortBigToTop {
    static int limitCounter = 0;
    static int barrierCounter = 0;

    public static void main(String[] args) {
        int[] intArr = new int[10];
        Random random = new Random();
        for (int tmp = 0; tmp < intArr.length; tmp++) {
            intArr[tmp] = random.nextInt(20);
        }
        for (int limit = intArr.length - 1; limit >= 1; limit--) {
            for (int index = 0; index < limit; index++) {
                sorting(intArr, index);
                barrierCounter++;
            }
            limitCounter++;
            System.out.println(Arrays.toString(intArr));
        }
//        System.out.println(Arrays.toString(intArr) + ", " + limitCounter + ", " + barrierCounter);
    }

    private static void sorting(int[] arr, int index) {
        int biggerIndex = index + 1;
        if (arr[index] > arr[biggerIndex]) {
            int swap = arr[index];
            arr[index] = arr[biggerIndex];
            arr[biggerIndex] = swap;

        }
    }
}
