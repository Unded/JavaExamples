package nio2.read.open_path_read_from_bytechannel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadByteChannel {
    public static void main(String[] args) {

        try(SeekableByteChannel fChan = Files.newByteChannel(Paths.get("test_text.txt"))){
            System.out.println("File size = " + fChan.size() + " b.");
            int n;
            ByteBuffer buffer = ByteBuffer.allocate(64);
            do {
                n = fChan.read(buffer);
                if (n != -1){
                    buffer.rewind();
                    for (int i = 0; i < n; i++)
                        System.out.print((char) buffer.get());
                }
            }while (n != -1);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
