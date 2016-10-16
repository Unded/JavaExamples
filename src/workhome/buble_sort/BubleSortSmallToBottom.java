package workhome.buble_sort;

import java.util.Arrays;
import java.util.Random;

public class BubleSortSmallToBottom {
    private static int limitCounter = 0;
    private static int barrierCounter = 0;

    public static void main(String[] args) {
        int[] intArr = new int[10];
        Random random = new Random();
        for (int tmp = 0; tmp < intArr.length; tmp++) {
            intArr[tmp] = random.nextInt(20);
        }
        System.out.println("Init array: " + Arrays.toString(intArr));
        //Основной цикл идет от нулевого элемента к последнему
        //т.к. в надчале будут отсортированные элементы и
        //проверять их нет смысла
        for (int limit = 0; limit < intArr.length - 1; limit++) {
            //Вложеный цикл идет от конца к началу, и ищет наименьший элемент
            //Самый маленький элемент сдвигается в начало массива
            //Начинается проверка с элемента длина массива минус 1,
            //т.к. массив начинается с нулевого индекса
            for (int index = intArr.length - 1; index > limit; index--) {
                sorting(intArr, index);
                barrierCounter++;
            }
            limitCounter++;
        }
        System.out.println("Sorted array: " + Arrays.toString(intArr) + ", " + limitCounter + ", " + barrierCounter);
    }

    private static void sorting(int[] arr, int index) {
        //Если входящий элемент массива больше элемент минус один (предыдущего),
        //то они меняются местами
        int smallerIndex = index -1;
        if (arr[smallerIndex] > arr[index]) {
            int swap = arr[smallerIndex];
            arr[smallerIndex] = arr[index];
            arr[index] = swap;

        }
    }
}
