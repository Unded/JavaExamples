package network.srv_for_browser_multytrhead;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultThreadSrvDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        try(ServerSocket srvSocket = new ServerSocket(8080)){

            while (true){
                Socket socket = srvSocket.accept();
                executorService.execute(new ThreadToConn(socket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
