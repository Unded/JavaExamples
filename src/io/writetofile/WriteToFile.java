package io.writetofile;

import java.io.*;

public class WriteToFile {
    public static void main(String[] args) {

        String str = "";
        File f = new File("test_text.txt");

        try(FileOutputStream file = new FileOutputStream(f);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(file))){

            int [] arr = new int[10];
            for (int i = 0; i < arr.length; i++){
                arr[i] = i + 1;
            }
            for (int anArr : arr) {
                if (anArr == arr.length){
                    str = str + (String.valueOf(anArr) + ".");
                    break;
                }
                str = str + (String.valueOf(anArr) + ", ");
            }
            writer.write("Array have " + arr.length + " numbers:\n");
            writer.write(str);
            System.out.println(f.getAbsolutePath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Something wrong...");
        }
    }
}
