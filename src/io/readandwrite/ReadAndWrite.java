package io.readandwrite;

import java.io.*;

public class ReadAndWrite {

    private String myFileName;
    private boolean eof = false;
    private StringBuilder builder = new StringBuilder();

    ReadAndWrite(String name) {
        myFileName = name;
    }

    String readTextFile() {
        try (FileInputStream file = new FileInputStream(myFileName);
             BufferedReader reader = new BufferedReader(new InputStreamReader(file))) {

            while (!eof) {
                int ch = reader.read();
                if (ch == -1) eof = true;
                else builder.append((char) ch);
            }


        } catch (FileNotFoundException e) {
            System.out.println("File lost ...");
        } catch (IOException e) {
            System.out.println("Something wrong with I/O!");
        }
        return builder.toString();
    }

    void writeTextFile(String newFileName) {

        try (FileOutputStream outputStreamFile = new FileOutputStream(newFileName);
             FileInputStream fileInputStream = new FileInputStream(myFileName);
             BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
             PrintStream print = new PrintStream(outputStreamFile)) {

            while (!eof){
                String chWrite = reader.readLine();
                if (chWrite == null) eof = true;
                else print.println(chWrite);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File lost ...");
        } catch (IOException e) {
            System.out.println("Something wrong with I/O!");
        }
    }

    String copyFileText(String newFileName) {
        try(FileOutputStream fileOutputStream = new FileOutputStream(newFileName);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fileOutputStream))){

            writer.write(readTextFile());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Copy file - successful";


}

}
