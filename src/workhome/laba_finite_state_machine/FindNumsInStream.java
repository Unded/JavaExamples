package workhome.laba_finite_state_machine;

import java.io.*;
import java.util.Arrays;

public class FindNumsInStream {
    public static void main(String[] args) {
        try (OutputStream out = new FileOutputStream("Laba+.txt", false);
             InputStream in = new FileInputStream("Laba.txt")) {

            getFilter(out, in);

            readIntFile();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readIntFile() {
        File file = new File("Laba+.txt");
        try(InputStream in = new BufferedInputStream(new FileInputStream(file))) {
            int data;
            while ((data = in.read()) != -1){
                System.out.print((char) data + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void getFilter(OutputStream out, InputStream in) throws IOException {
        OutputStreamWriter outWriter = new OutputStreamWriter(out);
        InputStreamReader inReader = new InputStreamReader(in);
        char[] buff = new char[in.available()];
        int count;
        while ((count = inReader.read(buff)) != -1) {
            System.out.println(Arrays.toString(buff));
            IState state = new ZeroImplementState(outWriter, buff.length);
            for (int i = 0; i < count; i++){
                state = state.next(buff[i]);
            }
            state.finish();
        }
    }
}
