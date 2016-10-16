package Reference.softreference;

import java.lang.ref.ReferenceQueue;

public class Test {
    public static void main(String[] args) {

        //Гоняем цикл, в котором создаем Мягкие ссылки
        //если бы это были Жесткие ссылки, КУЧА быстро переполнилась
        // и вылетело бы исключение
        for (int i = 0; i < 1000; i++) {
            MakeTest testing = new MakeTest();
            testing.softRefArr();
        }

    }

}
