package network.http_url_con;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpUrlDemo {
    public static void main(String[] args) {

        try {
            URL url = new URL("http://www.google.com");

            HttpURLConnection hpCon = (HttpURLConnection) url.openConnection();

            System.out.println("Request method: " + hpCon.getRequestMethod());

            System.out.println("Response code: " + hpCon.getResponseCode());
            System.out.println("Response message: " + hpCon.getResponseMessage());

            Map<String,List<String>> hpMap = hpCon.getHeaderFields();

            // Для возможномти прогнать коллекцию МАР по циклу foreach, вызываем метод keySet()
            Set<String> hdrField = hpMap.keySet();

            //Прогоняие по циклу полецию SET  и по ключу получаем значение из МАР
            for (String str : hdrField){
                System.out.println("Key: " + str + ".  Value: " + hpMap.get(str));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
