package externalization;

import java.io.*;

public class ExtDemo {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "P2";
        p1.age = 28;

        try(FileOutputStream fileOut = new FileOutputStream("test.ext");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut)){

            objOut.writeObject(p1);

        } catch (IOException e) {
            e.printStackTrace();
        }



        try(FileInputStream fileIn = new FileInputStream("test.ext");
            ObjectInputStream objIn = new ObjectInputStream(fileIn)){

            Person bestP = (Person) objIn.readObject();
            System.out.println(bestP.age + " " + bestP.name);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
