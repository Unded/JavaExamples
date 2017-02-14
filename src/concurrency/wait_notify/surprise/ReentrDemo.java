package concurrency.wait_notify.surprise;

/** Демонстрируется разница работы методов SLEEP и WAIT
 *
 Когад метод WAIT() используется неправильно или необдуманно,
 Это может привусти к неприятным последствиям.

    В этом примере рассмотрена возможность замены значения
 переменной (другим потоком Т1 и другим синхронизированным методом .setValue())
 в сихронизированном методе .process(), который использует поток Т2.

    Сложившаяся ситуация:
 Поток Т2 вошел в метод .process() и уснул, в это время поток Т1 попытался выполнить
 подификации переменной VALUE, но не получил доступ.
 Поток Т2 проснулся и продолжил свое мыполнение, выполнил меод WAIT и остановился,
 тем самым отдал МОНИТОР переменной VALUE потоку Т1.
 Поток Т1 получил доступ к переменной VALUE, вызвал метод .setValue() и
 изменил значение переменной, после этого завершил выполнение.
 Завершение потока Т1 дало возможность продолжить выполнение потоку Т2,
 прочитать значение переменной VALUE и завершить свое выполнение. */

public class ReentrDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main :: Thread starting");
        SyncObj object = new SyncObj();
        System.out.println("main :: Setting value");
        object.setValue(1);
        System.out.println("main :: Set value 1");
        Thread t = new Thread(new NewThread(object));
        t.start();

        System.out.println("main :: Slepping 1 sec");
        Thread.sleep(1000);

        System.out.println("main :: Start updating value... ");
        System.out.println("main :: Value updated : " + object.setValue(2));
        System.out.println("main :: Set value 2");

    }

}
