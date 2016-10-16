package workhome;

import java.io.*;
import java.util.Arrays;

public class FileFilter {
    public static void main(String[] args) {
        filter();
    }

    private static void filter() {
        File fileSrc = new File("Int.txt");

        try (FileInputStream in = new FileInputStream(fileSrc);
             DataInputStream dataIn = new DataInputStream(new BufferedInputStream(in));

            FileOutputStream out = new FileOutputStream("IntData.txt", false);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out))) {


            byte[] data = new byte[dataIn.available()];
            dataIn.readFully(data,0,dataIn.available());
            for (byte element : data) {
                System.out.println(element);
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
