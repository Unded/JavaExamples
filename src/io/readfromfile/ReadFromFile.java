package io.readfromfile;


import java.io.*;

public class ReadFromFile {

    public static void main(String[] args) {

        int ch;
        boolean eof = false;
        StringBuilder builder = new StringBuilder();


            try (FileInputStream file = new FileInputStream("text.txt")) {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(file));

                    while (!eof) {
                        ch = reader.read();
                        if (ch == -1) eof = true;
                        else builder.append((char) ch);
                    }

                System.out.println(builder.toString());
            } catch (FileNotFoundException e) {
                System.out.println("File lost ...");
            } catch (IOException e) {
                System.out.println("Something wrong with I/O!");
            }


    }
}
