package io.pushback;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushBackInputStreamDemo {
    public static void main(String[] args) {

        String s = "if (a == 4) a = 0;";
        byte [] bArr = s.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(bArr);

        int c;

        try(PushbackInputStream pushback = new PushbackInputStream(in)){

            while ((c = pushback.read()) != -1 ){

                switch (c){
                    case '=':
                        if ((c = pushback.read()) == '='){
                            System.out.print(".eq.");
                        }
                        else {
                            System.out.print("<-");
                            //программа возвращается на символ,
                            // которыый содержался в СВИТЧ до начала его работы
                            pushback.unread(c);
                        }
                        break;
                    default:
                        System.out.print((char) c);
                        break;
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
