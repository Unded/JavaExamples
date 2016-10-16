package network.dowdnliadfile;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DownloadFileDemo {
    public static void main(String[] args) {
        URL url;
        URLConnection urlCon;

        InputStream inputStream = null;
        FileOutputStream outputStream = null;

        BufferedInputStream buff = null;

        try{
            url = new URL("http://cdimage.ubuntu.com/daily-live/20160323/xenial-desktop-i386.list");
            urlCon = url.openConnection();

            outputStream = new FileOutputStream("download_file.list");
            inputStream = urlCon.getInputStream();
            buff = new BufferedInputStream(inputStream);

            int data;
            while ((data = buff.read()) != -1){
                outputStream.write(data);
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{

                inputStream.close();
                buff.close();
                outputStream.flush();
                outputStream.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
