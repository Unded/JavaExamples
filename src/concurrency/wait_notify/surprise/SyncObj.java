package concurrency.wait_notify.surprise;

public class SyncObj {
    private int value;

    public synchronized boolean setValue(int value){
        System.out.println("+++ Value updated " + (this.value = value));
//        this.value = value;
        return this.value == value;
    }


    public synchronized void process(){
        System.out.println("own :: Start Value " + value);
        try{
            //Метод Sleep() продолжает "держать" метод для потока,
            //для которого он вызван
            System.out.println("own :: Start sleeping 2 sec");
            Thread.sleep(2000);
            //Метод WAIT() "освобождает" метод для доступа другого птока!!!
            System.out.println("own :: Start waiting 1 sec");
            wait(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("own :: End Value " + value);
    }
}
