package workhome.laba_finite_state_machine;

import java.io.IOException;

public interface IState {

    IState next(char value) throws IOException;

    void finish() throws IOException;

}
