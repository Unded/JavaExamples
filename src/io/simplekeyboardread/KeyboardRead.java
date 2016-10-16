package io.simplekeyboardread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardRead {

    public static void main(String[] args) throws IOException {

        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input text (q - exit)");
        do {
            c = (char) br.read();
            if (c != 'q') System.out.print(c);
        }while (c !='q');
    }
}
