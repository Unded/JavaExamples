package network.clientserversocket;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(8080)) {

            System.out.println("Waiting client request... ");
            int count = 1;
            String str;

            while (true) {
                //Кодга сервер ставится на паузу в цикле, он бдует зациклен
                //и будет ждать запросов от клиента даже если клиенты закончит свою работу
                //сервер продолжит работать
                Socket socket = serverSocket.accept();

                InputStream inputStream = socket.getInputStream();
                OutputStream outputStream = socket.getOutputStream();

                DataInputStream dataIn = new DataInputStream(inputStream);
                DataOutputStream dataOut = new DataOutputStream(outputStream);

                str = dataIn.readUTF();
                String price = (new Double(Math.random() * 100)).toString();
                dataOut.writeUTF("The price for " + str + " is " + price + ".");
                dataOut.writeUTF("End");
                dataOut.flush();
                System.out.println(str);
                System.out.println("Request #" + count++ + " is done , waiting new request");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}