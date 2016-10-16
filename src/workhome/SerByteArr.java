package workhome;

import java.io.*;

public class SerByteArr {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        ObjectOutput outObject = new ObjectOutputStream(outStream);

        //Save "Hello" in Stream
        outObject.writeObject("Hello!");
        outObject.flush();
        outObject.close();

        //Save stream object in new array
        byte[] data = outStream.toByteArray();
        //Print array length
        System.out.println(data.length);

        ObjectInputStream inStream = new ObjectInputStream(new ByteArrayInputStream(data));
        System.out.println(inStream.readObject());
    }
}
