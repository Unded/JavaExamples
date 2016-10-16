package io.readandwrite;

public class ReadAndWriteDemo {
    public static void main(String[] args) {

        ReadAndWrite rw = new ReadAndWrite("text.txt");
//        System.out.println(rw.readTextFile());
        rw.copyFileText("copy_text.txt");


    }
}
