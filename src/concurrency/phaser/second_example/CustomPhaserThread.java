package concurrency.phaser.second_example;

import java.util.concurrent.Phaser;

public class CustomPhaserThread implements Runnable {

    Phaser phaser;
    String name;

    CustomPhaserThread(Phaser phaser, String name){
        this.name = name;
        this.phaser = phaser;
        phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!phaser.isTerminated()){
            System.out.println("Thread " + name + " starting phase " + phaser.getPhase());
            phaser.arriveAndAwaitAdvance();
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
