package concurrency.wait_notify.surprise;

//Демонстрируется разница работы методов SLEEP и WAIT
public class ReentrDemo {

    public static void main(String[] args) {
        System.out.println("main :: Thread starting");
        SyncObj object = new SyncObj();
        System.out.println("main :: Setting value");
        object.setValue(1);
        System.out.println("main :: Set value 1");
        Thread t = new Thread(new NewThread(object));
        t.start();

        try{
            System.out.println("main :: Slepping 1 sec");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main :: Setting value");
        object.setValue(2);
        System.out.println("main :: Set value 2");

    }

}
