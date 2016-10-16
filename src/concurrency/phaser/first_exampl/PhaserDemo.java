package concurrency.phaser.first_exampl;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {

        Phaser phaser = new Phaser(1);

        System.out.println("Threads start");
        new PhaserThread(phaser, "A");
        new PhaserThread(phaser, "B");
        new PhaserThread(phaser, "C");

        //Главный поток ожидает когда потоки (А, В, С)
        //вызывут метод arriveAndAwaitAdvance(),
        //это оповестит главный поток о окончании фазы в каждом из потоков
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase" + phaser.getPhase() + " finished.");

        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase" + phaser.getPhase() + " finished.");

        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase" + phaser.getPhase() + " finished.");

        //Снимает с регистрации все потоки изполнения типа PhaserThread
        phaser.arriveAndDeregister();
        if (phaser.isTerminated()) System.out.println("All phasers finished");

    }
}
