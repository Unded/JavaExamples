package workhome.revers_array;

import java.util.Arrays;
import java.util.Random;

public class ReversalFunctionFromEdgeToMiddle {

    public static void main(String[] args) {
        int[] data = initData();
        System.out.println(Arrays.toString(data) + ", date.length = " + (data.length / 2));

        //Цикл проходит по элементам от нувого до середины
        for (int index = 0; index < data.length / 2; index++) {
            //Метод меняет местами элементы по индеску цикла
            // индекс (например 0) и длина массива минус один (иначе выйдет за пределы массва) и минус индекс
            dataExchange(data, index, data.length - index - 1);
            System.out.println(Arrays.toString(data));
        }

        System.out.println(Arrays.toString(data));
    }

    private static void dataExchange(int[] data, int indexFirst, int indexLust) {
        int swap = data[indexLust];
        data[indexLust] = data[indexFirst];
        data[indexFirst] = swap;
    }

    private static int[] initData() {
        Random random = new Random();
        int arrayLength = random.nextInt(5) + 5;
        int[] data = new int[arrayLength];

        for (int tmp = 0; tmp < data.length; tmp++) {
            data[tmp] = random.nextInt(20);
        }

        return data;
    }
}
