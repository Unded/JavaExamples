package io.enumeration_input;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequensInputStreamDemo {
    public static void main(String[] args) {

        int c = 0;
        Vector<String> files = new Vector<>();
        files.addElement("test_text.txt");
        files.addElement("test_text.txt");
        files.addElement("test_text.txt");
        InpStreamEnum enm = new InpStreamEnum(files);
        try(InputStream inStream = new SequenceInputStream(enm)){
            while ((c = inStream.read()) != -1){
                System.out.print((char) c);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
