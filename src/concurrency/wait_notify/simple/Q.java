package concurrency.wait_notify.simple;

public class Q {
    int i;
    boolean valueSet = false;

    synchronized int get(){
        while (!valueSet)
            try{
                System.out.println("Method GET wait");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Get " + i);
            valueSet = false;
        System.out.println("Method GET notify");
            notify();

        return i;
    }

    synchronized void put(int n){
        while (valueSet)
            try {
                System.out.println("Method PUT wait");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.i = n;
            valueSet = true;
            System.out.println("Put " + n);
        System.out.println("Method PUT notify");
            notify();

    }
}
