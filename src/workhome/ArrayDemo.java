package workhome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Из массива, состоящего из 0 и 1 делаем массив только из 1
public class ArrayDemo {
    public static void main(String[] args) {
        byte[] src = {1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0};
        byte[] swap;
        List<Byte> data = new ArrayList<>();
        int start = 0;

        System.out.println(Arrays.toString(src));

        for (int i = 0; i < src.length; i++) {

            if (src[i] == 0) {
                continue;
            } else if (src[i] == 1) {
                start = i;
            }

            for (int j = i + 1; j < src.length; j++) {
                if (src[j] == 0) {
                    swap = Arrays.copyOfRange(src, start, j);

                    for (byte aSwap : swap) {
                        data.add(aSwap);
                    }

                    i = j;
                    break;
                }
            }
        }

        System.out.println(data);

    }
}
