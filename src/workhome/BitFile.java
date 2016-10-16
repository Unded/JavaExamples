package workhome;

import java.io.*;
import java.util.Random;

public class BitFile {
    public static void main(String[] args) {
        createBitFile();
        System.out.println(readFromFile());
    }

    private static StringBuilder readFromFile() {
        File file = new File("Laba.txt");

        StringBuilder data = new StringBuilder();

        try(FileInputStream in = new FileInputStream(file);
            BufferedReader dataRead = new BufferedReader(new InputStreamReader(in))){

            int element;
            while ((element = dataRead.read()) != -1){
                    data.append((char)element);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }

    private static void createBitFile() {
        File file = new File("Laba.txt");

        Random r = new Random();
        String str = "";
        for (int i = 0; i < 10; i++) {
            str += Integer.toBinaryString(r.nextInt(127));
        }

        try(FileOutputStream out = new FileOutputStream(file, false);
            OutputStreamWriter dataWriter =new OutputStreamWriter(new BufferedOutputStream(out))){

            System.out.println(str);
            dataWriter.write(str);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
