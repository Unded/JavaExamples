package concurrency.isalivejoin;

public class Main {
    public static void main(String[] args) {
        NewThread thr1 = new NewThread("First");
        NewThread thr2 = new NewThread("Second");
        NewThread thr3 = new NewThread("Third");

//        System.out.println(thr1.t.getName() + "thread in work: " + thr1.t.isAlive());
//        System.out.println(thr2.t.getName() + "thread in work: " + thr2.t.isAlive());
//        System.out.println(thr3.t.getName() + "thread in work: " + thr3.t.isAlive());

        try{

            System.out.println("Waiting ... ");
            thr1.t.join();
            thr2.t.join();
            thr3.t.join();


        }catch (InterruptedException e) {
            System.out.println("Main thread stoped");
        }

        System.out.println(thr1.t.getName() + "thread in work: " + thr1.t.isAlive());
        System.out.println(thr2.t.getName() + "thread in work: " + thr2.t.isAlive());
        System.out.println(thr3.t.getName() + "thread in work: " + thr3.t.isAlive());

        System.out.println("Main thread finished");

    }
}
