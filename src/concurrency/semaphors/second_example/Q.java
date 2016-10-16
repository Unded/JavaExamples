package concurrency.semaphors.second_example;

import java.util.concurrent.Semaphore;

public class Q {
    private int n;

    private static Semaphore semCon = new Semaphore(0);
    private static Semaphore semProd = new Semaphore(1);

    void get(){
        try {
            semCon.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Get " + n);
        //Только после окончания работы метода put() вызывается метод release,
        //разрешающий доступ 1 потоку к семафору semProd.
        //Если semProd.release() вызывать в методе put, то semProd будет разрешать сам себя.
        semProd.release();
    }

    void put(int n){
        try {
            semProd.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.n = n;
        System.out.println("Put " + n);
        //Т.к. Семафор semCon = 0 перед тем как поток получит доступ к этому семафору
        //необходима вызвать метод release(), чтоб увеличить количество потоков,
        //которые могут вызать семафор с 0 до 1.
        semCon.release();
    }


}
