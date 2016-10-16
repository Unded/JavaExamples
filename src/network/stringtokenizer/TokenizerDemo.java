package network.stringtokenizer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.StringTokenizer;

public class TokenizerDemo {

    public static void main(String[] args) {

        String csvData;
        URL url;
        URLConnection urlCon;
        InputStreamReader streamReader = null;
        BufferedReader buff = null;

        try {
            url = new URL("http://quote.yahoo.com/d/quotes.csv?s=IBM&f=sl1d1t1c1ohgv&e=.csv");
            urlCon = url.openConnection();

            streamReader = new InputStreamReader(urlCon.getInputStream());
            buff = new BufferedReader(streamReader);

            csvData = buff.readLine();
            StringTokenizer tokenizer = new StringTokenizer(csvData, ",");
            String name = tokenizer.nextToken();
            String price = tokenizer.nextToken();
            String tradeDate = tokenizer.nextToken();
            String tradeTime = tokenizer.nextToken();

            System.out.println("Name: " + name + "\nPrice: " + price + "\nDate: " + tradeDate + "\nTime: " + tradeTime);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                streamReader.close();
                buff.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
