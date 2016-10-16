package workhome;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ByteFile {
    public static void main(String[] args) {

        createIntFile();
        readIntFile();

    }

    private static void readIntFile() {
        File file = new File("Laba.txt");

        try (FileInputStream in = new FileInputStream(file);
             DataInputStream dataIn = new DataInputStream(in)) {
            List<Integer> data = new ArrayList<>();

            while (dataIn.available() > 0) {
                data.add(dataIn.readInt());
            }

            System.out.println(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createIntFile() {
        File file = new File("Laba.txt");

        int[] intData = new int[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            intData[i] = r.nextInt(2);
        }

        System.out.println(Arrays.toString(intData));

        try (FileOutputStream out = new FileOutputStream(file, false);
             DataOutputStream dataOut = new DataOutputStream(new BufferedOutputStream(out))) {

            for (int element : intData) {
                dataOut.writeInt(element);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
