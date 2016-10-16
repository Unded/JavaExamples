package concurrency.phaser.second_example;

import java.util.concurrent.Phaser;

public class CustomPhaser extends Phaser {

    int numPhases;

    CustomPhaser(int parties, int phaseCount){
        super(parties);
        numPhases = phaseCount;
    }

    @Override
    protected boolean onAdvance(int phase, int registeredParties) {

        System.out.println("Phase " + phase + " finished\n");
        if (phase == numPhases || registeredParties == 0)
            return true;
        return false;
    }
}
