package concurrency.phaser.second_example;

import java.util.concurrent.Phaser;

public class CustomPhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new CustomPhaser(1, 4);
        new CustomPhaserThread(phaser, "A");
        new CustomPhaserThread(phaser, "B");
        new CustomPhaserThread(phaser, "C");

        while (!phaser.isTerminated())
            phaser.arriveAndAwaitAdvance();

        System.out.println("Phaser finised");
    }
}
