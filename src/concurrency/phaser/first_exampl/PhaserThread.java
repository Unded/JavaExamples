package concurrency.phaser.first_exampl;

import java.util.concurrent.Phaser;

public class PhaserThread implements Runnable {

    Phaser phaser;
    String name;

    //Каждый новый поток исполнения становится новой стороной
    PhaserThread(Phaser ph, String name){
        //Создаем новую сторону
        phaser = ph;
        //Регистрируем новую сторону
        phaser.register();
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Thread " + name + " begin 1 phase");
        //Поток исполнения завершает фазу и ждет сообщения от других потоков,
        //что они тоже завершили фазу
        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread " + name + " begin 2 phase");
        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread " + name + " begin 3 phase");
        phaser.arriveAndDeregister();
    }
}
