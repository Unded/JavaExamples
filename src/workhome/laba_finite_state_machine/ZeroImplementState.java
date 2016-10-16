package workhome.laba_finite_state_machine;

import java.io.OutputStreamWriter;

public class ZeroImplementState implements IState {
    private final OutputStreamWriter out;
    private int maxSize;

    public ZeroImplementState(OutputStreamWriter out, int maxSize) {
        this.out = out;
        this.maxSize = maxSize;
    }

    @Override
    public IState next(char value) {
        if (value == '0'){
            return this;
        }else {
            return new NumImplementState(out, maxSize);
        }
    }

    @Override
    public void finish() {

    }
}
