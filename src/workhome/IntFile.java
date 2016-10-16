package workhome;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class IntFile {
    public static void main(String[] args) {

        createIntFile();
        readIntFile();

    }

    private static void readIntFile() {
        File file = new File("Int.txt");

        try(FileInputStream in = new FileInputStream(file);
            DataInputStream dataIn = new DataInputStream(in)){
            List<Integer> data = new ArrayList<>();

            while (dataIn.available() > 0){
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
        File file = new File("Int.txt");

        Random r = new Random();
        int[] intData = new int[100];
        for (int i = 0; i < 100; i++) {
            intData[i] = + r.nextInt(2);
        }

        System.out.println(Arrays.toString(intData));

        try(FileOutputStream out = new FileOutputStream(file, false);
            DataOutputStream dataOut = new DataOutputStream(new BufferedOutputStream(out))){

            for (int element : intData){
                dataOut.writeInt(element);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
