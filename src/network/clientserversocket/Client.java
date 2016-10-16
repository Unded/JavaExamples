package network.clientserversocket;

import java.io.*;
import java.net.*;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {

        String symbol = "IBM";
        try(Socket clientSocket = new Socket("127.0.0.1", 8080)){

            System.out.println("Client: " + clientSocket);



            String price;
            while (true){
                try(InputStream inputStream = clientSocket.getInputStream();
                    OutputStream outStream = clientSocket.getOutputStream()) {

                    DataInputStream in = new DataInputStream(inputStream);
                    DataOutputStream out = new DataOutputStream(outStream);

                    out.writeUTF(symbol);
                    price = in.readUTF();
                    if (("End").equals(price)) break;

                    System.out.println("The price for " + symbol + " is " + price);
                    out.flush();
                }
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}