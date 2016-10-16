package concurrency.volatile_example;

public class VolatileDemo {

    //Если переменная ready бдует без ключевого слова volatile
    //программа никогда не закончит своего выполнения.
    //Т.к. второй поток никогда не узнает об ее изменении
    //т.к. значение этой переменной будет в КЭШе ядра процессора,
    //а изменения будут происходить в оперативной памяти и второй поток
    //без принуждения не пойдет в оперативную память.
    //А первый поток без принуждения может не записать изменения
    //в оперативную память
    static volatile boolean ready = false;
    static int data = 0;

    public static void main(String[] args) {

        //Использование Лямбда-выражения
        new Thread(() -> {
            try {
                Thread.sleep(1000);
                data = 1;
                ready = true;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        //Использование анонимного класса
        new Thread(new Runnable() {
            @Override
            public void run() {
                //Бесконечный цикл
                while (!ready) ;
                System.out.println(data);
            }
        }).start();
    }
}
