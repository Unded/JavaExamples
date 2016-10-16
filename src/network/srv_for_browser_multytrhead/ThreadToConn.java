package network.srv_for_browser_multytrhead;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.Arrays;

public class ThreadToConn implements Runnable {
    Socket socket;

    public ThreadToConn(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (InputStream in = socket.getInputStream();
             OutputStream out = socket.getOutputStream()) {
            System.out.println("--------------------------");
            System.out.println(LocalDateTime.now());
            byte[] request = readRequest(in);
            System.out.println(new String(request, "ASCII"));

            Thread.sleep(10000);

            byte[] response = LocalDateTime.now().toString().getBytes();
            out.write(response);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static byte[] readRequest(InputStream in) throws IOException {
        //Буффер для InputStream
        byte[] buff = new byte[4096];
        while (true) {
            int count = in.read(buff);
            if (count < 0) {
                throw new RuntimeException("Request is empty");
            } else {
                if (count == buff.length) {
                    throw new OutOfMemoryError("Request is too big. Sorry");
                }
                if (count > 0) {
                    return Arrays.copyOf(buff, count);
                }
            }
        }
    }
}
