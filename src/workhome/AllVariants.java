package workhome;

import java.util.Arrays;

public class AllVariants {
    public static void main(String[] args) {
        int[] data = {1, 2, 3};
        permute(data, data.length);
    }

    private static void permute(int[] data, int length) {

        if (length < 2) {
            System.out.println(Arrays.toString(data));
        } else {
            for (int index = 0; index < length; index++) {
                //Меняем между собой индексный и последний элементы
                swap(data, index, length - 1);
                //Уменьшаем длинну массива на 1 и не увеличивая индекс входит в метод permute()
                permute(data, length - 1);
                //Меняем между собой индексный и последний элементы
                //и выходит из цикла
                swap(data, index, length - 1);
            }
        }

    }

    private static void swap(int[] data, int index1, int index2) {
        int tmp = data[index1];
        data[index1] = data[index2];
        data[index2] = tmp;
    }
}
