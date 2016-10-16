package network.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class BasicNetworkTryWithRes {

    public static void main(String[] args) {

        try(InputStreamReader streamReader =
                    new InputStreamReader(new URL("https://www.google.com/").openConnection().getInputStream(), "UTF8");
            BufferedReader bufferedReader = new BufferedReader(streamReader)){
            String nextLine;
            while (true){
                nextLine = bufferedReader.readLine();
                if (nextLine != null){
                    System.out.println(nextLine);
                }else break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
