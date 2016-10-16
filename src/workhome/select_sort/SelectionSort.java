package workhome.select_sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] array = {30, 1, 10, 4, 5, 6, 23, 15, 23, 4342, 112, 78, 879, 0};

        System.out.println("Not sorted array: " + Arrays.toString(array));

        for (int barrier = 0; barrier < array.length; barrier++) {
            int swapBarrierIndex = barrier;
            int tmpBarrier = array[swapBarrierIndex];
            for (int index = barrier + 1; index < array.length; index++) {
                int tmpIndex = array[index];
                //Ищем самый маленький элемент в массиве
                //Улучшаем производительность, т.к. сравнение с примитивами быстрее
                if (tmpBarrier > tmpIndex) {
                    //Запоминаем индекс самого маленького элемента в массива
                    swapBarrierIndex = index;
                }
            }
            //Меняем местами самый маленький из найденных элементнов
            // и проверяемый сейчас элемент местами
            int swap = array[barrier];
            array[barrier] = array[swapBarrierIndex];
            array[swapBarrierIndex] = swap;
        }
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}

