package nio2.write;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteChannelExplicit {
    public static void main(String[] args) {

        try(FileChannel fChn = (FileChannel) Files.newByteChannel(
                                                Paths.get("testing_chanell.txt"),
                                                            StandardOpenOption.WRITE,
                                                            StandardOpenOption.CREATE)){

            ByteBuffer byteBuffer = ByteBuffer.allocate(26);
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < byteBuffer.limit(); i++) {
                    if (i == byteBuffer.limit() - 1) byteBuffer.put((byte)'\n');
                    else byteBuffer.put((byte) ('A' + i));
                }

                byteBuffer.rewind();
                fChn.write(byteBuffer);
                byteBuffer.rewind();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
