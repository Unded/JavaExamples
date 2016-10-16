package workhome.laba_finite_state_machine;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class NumImplementState implements IState {
    private final OutputStreamWriter out;
    private char[] buff;
    private int counter = 1;
    private int maxSize1;
    private  BufferedWriter outWriter;

    NumImplementState(OutputStreamWriter out, int maxSize){
        this.out = out;
        outWriter = new BufferedWriter(out);
        this.maxSize1= maxSize;
        buff = new char[maxSize1];
        buff[0] = '1';
    }

    @Override
    public IState next(char value) throws IOException {
        if (value == '0'){
            char[] swap = Arrays.copyOfRange(buff, 0, counter);
            outWriter.write(swap);
            outWriter.flush();
            System.out.println(Arrays.toString(swap));
            return new ZeroImplementState(out, maxSize1);
        }else {
            buff[counter++] = value;
            return this;
        }

    }

    @Override
    public void finish() throws IOException {
        char[] swap = Arrays.copyOfRange(buff, 0, counter);
        outWriter.write(swap);
        outWriter.flush();
        System.out.println(Arrays.toString(swap));
    }
}
