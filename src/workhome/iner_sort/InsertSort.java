package workhome.iner_sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {30, 1, 10, 4, 5, 6, 23, 15, 23, 4342, 112, 78, 879, 0};

        System.out.println("Not sorted array: " + Arrays.toString(array));
        //Вариант сортировки массива циклами

        for (int barrier = 1; barrier < array.length; barrier++){
            int tmp = array[barrier];
            int index = barrier - 1;
            while (index >= 0 && array[index] > tmp){
                array[index + 1] = array[index];
                index--;
            }
            array[index + 1] = tmp;
        }
        System.out.println("Sorted array: " + Arrays.toString(array));


        //Сортировка массива условием и Arrays.binarySearch и System.arraycopy

        //Сначала копируем "хвост" массива от барьера + 1 до конца
        //Потом копируем элементы от индекса куда вствим элемент до барьера
        //И устанавливаем "элемент" в новый индекс
        //Элементы массива до установленного "элемента" остаются без изменений
//        for (int barrier = 1; barrier < array.length; barrier++) {
//            if (array[barrier] < array[barrier - 1]) {
//                int element = array[barrier];
//                array[barrier] = array[barrier - 1];
//                int barrierNewIndex = Arrays.binarySearch(array, 0, barrier - 1, element);
//                if (barrierNewIndex <= 0) {
//                    //Если Arrays.binarySearch вернул отрицательное число
//                    //т.е. не нашел такого же значения в массиве, но нашел позицию
//                    // где это значение должно быть по порядку
//                    int barrierNewIndexABS = Math.abs(barrierNewIndex) - 1;
//                    System.arraycopy(array, barrier + 1, array, barrier + 1, array.length - (barrier + 1));
//                    System.arraycopy(array, barrierNewIndexABS, array, barrierNewIndexABS + 1, barrier - (barrierNewIndexABS));
//                    array[barrierNewIndexABS] = element;
//                } else {
//                    //Если Arrays.binarySearch вернул положительно число
//                    //т.е. нашел такое же значение в массиве, то записываем это число
//                    // в следеющую ячейку массива
//                    int barrierNewIndexABS = Math.abs(barrierNewIndex);
//                    System.arraycopy(array, barrier + 1, array, barrier + 1, array.length - (barrier + 1));
//                    System.arraycopy(array, barrierNewIndexABS, array, barrierNewIndexABS + 1, barrier - (barrierNewIndexABS));
//                    array[barrierNewIndexABS] = element;
//                }
//            }
//        }
//        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
