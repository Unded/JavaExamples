package concurrency.synch.synch_class_mth;

public class DemoSynch {
    public static void main(String[] args) throws InterruptedException {
        Data data = new Data();
        new Thread(() -> {
            System.out.println("First :: value = 1");
            try {
                data.setValue(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            System.out.println("Second :: Try to get value...");
            System.out.println("Second :: value = " + data.getValue());
        }).start();
    }

}
