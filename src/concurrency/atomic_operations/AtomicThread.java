package concurrency.atomic_operations;

public class AtomicThread implements Runnable{
    String name;

    AtomicThread(String name){
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Thread " + name + " starting");
        for (int i = 1; i <= 3; i++){
            System.out.println("Thread " + name + " get: "
                    //Выводится на экран значение atomicInt и после этого
                    //устанавливается наовое значение atomicInt = i
                    + SharedRes.atomicInt.getAndSet(i));
        }

    }
}
