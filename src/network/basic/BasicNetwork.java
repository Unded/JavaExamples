package network.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class BasicNetwork {

    public static void main(String[] args) {

        String nextLine;
        URL url;
        URLConnection urlCon;
        InputStreamReader streamReader = null;
        BufferedReader bufferedReader = null;

        try{
            url = new URL("https://www.google.com/");
            urlCon = url.openConnection();

            streamReader = new InputStreamReader(urlCon.getInputStream(), "UTF8");
            bufferedReader = new BufferedReader(streamReader);

            while (true){
                nextLine = bufferedReader.readLine();
                if (nextLine != null){
                    System.out.println(nextLine);
                }else break;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (streamReader != null){
                try{
                    streamReader.close();
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
