package workhome.merge_arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
//        int [] arrayFirst = {1,2,3,4,5};
//        int [] arraySecond = {6,7,8,9,10};
        int[] arrayFirst = {6, 7, 8, 9, 10, 11, 12, 13};
        int[] arraySecond = {0, 1, 2, 3, 4, 5};
        int[] data;

        System.out.println("First Array: " + Arrays.toString(arrayFirst));
        System.out.println("Second Array: " + Arrays.toString(arraySecond));
        data = mergeArrays(arrayFirst, arraySecond);
        System.out.println("Combination of Arrays: " + Arrays.toString(data));
    }

    private static int[] mergeArrays(int[] arrayFirst, int[] arraySecond) {
        int[] arraysCombination = new int[arrayFirst.length + arraySecond.length];
        int indexA  = 0;
        int indexB  = 0;

        for (int i = 0; i < arraysCombination.length; i++) {
            //Если достигнут максимальный индекс ПЕРВОГО массива
            if (indexA == arrayFirst.length) {
                //Перебираем ВТОРОЙ массив
                arraysCombination[i] = arraySecond[indexB++];
            //Если достигнут максимальный индекс ВТОРОГО массива
            } else if (indexB == arraySecond.length) {
                //Перебираем ПЕРВЫЙ массив
                arraysCombination[i] = arrayFirst[indexA++];
            //Если ни один из двух массивов не достиг последнего элемента
            // сравниваем элементы
            } else {
                //Если элемент второго массива больше элемента первого массива
                if (arrayFirst[indexA] < arraySecond[indexB]) {
                    arraysCombination[i] = arrayFirst[indexA++];
                //Если элемент первого массива больше элемента второго массива
                } else {
                    arraysCombination[i] = arraySecond[indexB++];
                }
            }
        }
        return arraysCombination;
    }
}
