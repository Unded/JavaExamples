package concurrency.synch.synch_method;

public class Main {
    public static void main(String[] args) {
        CallMe target = new CallMe();
        Caller obj1 = new Caller(target, "Welcome");
        Caller obj2 = new Caller(target, "in synch");
        Caller obj3 = new Caller(target, "world!");

        try{
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Stopped!");
        }
        System.out.println("Main thread is finished!");

    }
}
