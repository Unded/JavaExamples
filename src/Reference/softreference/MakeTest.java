package Reference.softreference;

import java.lang.ref.SoftReference;
import java.util.Random;

public class MakeTest {
    //Инициализировать Мягкую ссылку
    //Мягкая ссылка ссылается на массив целочисленных значений,
    //который занимает примерно 1700МБ
    SoftReference<int []> arrInt = new SoftReference<int[]>(new int[Integer.MAX_VALUE / 5]);

    void softRefArr(){
        //Получить Жесткую ссылку на Мягкую ссылку
        int [] intArr = arrInt.get();
        //Мягкая ссылка может бытьудалена ГК
        //Надо проверить и если Мягкая ссылка равна НУЛЛ,
        //Надо содзать новую Мягкую ссылку
        if (intArr == null){
            //Создаем массив целочисленных значений,
            //занимающий в КУЧЕ примерно 1700МБ
            intArr = new int[Integer.MAX_VALUE / 5];
            //Мягкая ссылка ссылается на массив целочисленных значений
            arrInt = new SoftReference<>(intArr);
        }
        Random r = new Random();
        intArr[0] = r.nextInt(1000) - 500;
        System.out.println(intArr[0]);
    }
}
