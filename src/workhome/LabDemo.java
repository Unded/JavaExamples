package workhome;

import java.io.*;
import java.util.Arrays;


public class LabDemo {
    public static void main(String[] args) {
        try (OutputStream out = new FileOutputStream("Laba+.txt", false);
             InputStream in = new FileInputStream("Laba.txt")) {

            getFilter(out, in);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void getFilter(OutputStream out, InputStream in) throws IOException {
        InputStreamReader inReader = new InputStreamReader(in);
        BufferedWriter outWriter = new BufferedWriter(new OutputStreamWriter(out));
        final int ZERO_STATE = 0;
        final int NUM_STATE = 1;
        char[] buff = new char[in.available()];
        int count;
        int start = 0;

        while ((count = inReader.read(buff)) != -1) {
            System.out.println(Arrays.toString(buff));
            int state = ZERO_STATE;

            for (int index = 0; index < count; index++) {

                switch (state) {

                    case ZERO_STATE:
                        if (buff[index] == '0') {
                            state = ZERO_STATE;
                        } else if (buff[index] != 0) {
                            start = index;
                            state = NUM_STATE;
                        }
                        break;

                    case NUM_STATE:
                        if (buff[index] == '0') {
                            char[] swap = Arrays.copyOfRange(buff, start, index);
                            outWriter.write(swap);
                            outWriter.flush();
                            System.out.print(Arrays.toString(swap));
                            state = ZERO_STATE;
                        } else if (buff[index] != 0) {
                            state = NUM_STATE;
                        }
                        break;
                }
            }
            if (state == NUM_STATE){
                char[] swap = Arrays.copyOfRange(buff, start, buff.length);
                outWriter.write(swap);
                outWriter.flush();
                System.out.print(Arrays.toString(swap));
            }
        }
    }
}
