package workhome.merge_arrays;

import java.util.Arrays;

public class MergeNotSortedArrays {


    public static void main(String[] args) {
        int[] array = {10, 2, 5, 4, 100, 1, 52, 9, 3, 1, -9};
        System.out.println(Arrays.toString(array));

        int[] data = shareArrays(array);
        System.out.println(Arrays.toString(data));
    }

    private static int[] shareArrays(int[] array) {
        if (array.length < 2)
            return array;

        int middle = array.length / 2;
        int[] arrayFirst = Arrays.copyOfRange(array, 0, middle);
        int[] arraySecond = Arrays.copyOfRange(array, middle, array.length);
        return mergeArrays(shareArrays(arrayFirst), shareArrays(arraySecond));
    }

    private static int[] mergeArrays(int[] arrayFirst, int[] arraySecond) {
        int[] arraysCombination = new int[arrayFirst.length + arraySecond.length];
        int indexA = 0;
        int indexB = 0;

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
