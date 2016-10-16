package concurrency.exchanger;

import java.util.concurrent.Exchanger;

public class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger<String> ex = new Exchanger<>();
        new SenderThread(ex);
        new AddresseeThread(ex);

    }
}
