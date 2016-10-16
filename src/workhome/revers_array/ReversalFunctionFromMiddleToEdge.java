package workhome.revers_array;

import java.util.Arrays;
import java.util.Random;

public class ReversalFunctionFromMiddleToEdge {

    public static void main(String[] args) {
        int[] data = initData();
        System.out.println(Arrays.toString(data) + ", date.length/2 = " + (data.length / 2));

        //Счетчик для прохода по циклу с середины массива до конца
        int tmp;
        //Если массив нечетной длины
        if (data.length % 2 != 0) {
             tmp = 1;
        //Если массив четной длины
        }else {
            tmp = 0;
        }
        //Идем с середины массива до первого элемента
        //Начало перебора значений с середины массива минс 1
        // и середина плюс 1 если массив НЕЧЕТНОЙ ДЛИНЫ
        // и середина плюс 0 если массив ЧЕТНОЙ ДЛИНЫ
        for (int index = data.length / 2; index > 0; index--) {
            dataExchange(data, index - 1, data.length / 2 + tmp++);
            System.out.println(Arrays.toString(data));
        }
    }

    private static void dataExchange(int[] data, int indexMid, int indexNextToMid) {
        int swap = data[indexNextToMid];
        data[indexNextToMid] = data[indexMid];
        data[indexMid] = swap;
    }

    private static int[] initData() {
        Random random = new Random();
        int arrayLength = random.nextInt(5) + 5;
        int[] data = new int[5];
        for (int tmp = 0; tmp < data.length; tmp++) {
            data[tmp] = random.nextInt(20);
        }

        return data;
    }
}
