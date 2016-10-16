package network.server_for_browser;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**Сервер для ответа на запрос от браузера,
 * вывод в консоль запрос браузера,
 * отправляет в ответ на запрос текущее время
 **/

public class SrvForBrowser {
    public static void main(String[] args){
        System.out.println("HTTP-Server starting ... ");
        //Создаем ServerSocket, который будем слушать
        try(ServerSocket srvSocket = new ServerSocket(8080)) {
            //Счетчик запросов
            int requestCount = 1;
            while (true) {
                System.out.println("Waiting request ... ");
                //Слушаем сокет
                Socket socket = srvSocket.accept();
                try (InputStream in = socket.getInputStream();
                     OutputStream out = socket.getOutputStream()) {
                    //Принимаем запрос
                    byte[] request = readRequest(in);
                    System.out.println(new String(request, "ASCII"));
                    System.out.println("Request " + requestCount++ + " done!");
                    System.out.println("----------------------------\n");
                    //Отправляем ответ
                    byte[] response = LocalDateTime.now().toString().getBytes();
                    out.write(response);
                }
            }
        } catch (IOException e) {
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
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return Arrays.copyOf(buff, count);
                }
            }
        }
    }
}
