package Tests.wait_notify;

public class Q {
    int i;
    boolean flag = false;

    synchronized void get(){
        while (!flag) {
            try {
                System.out.println("Method GET wait");
                wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Get " + i);
        flag = false;
        System.out.println("Method GET notify");
        notify();
    }

    synchronized void put(int n){
        while (flag) {
            try {
                System.out.println("Method PUT wait");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.i = n;
        flag = true;
        System.out.println("Put " + this.i);
        System.out.println("Method PUT notify");
        notify();

    }
}
