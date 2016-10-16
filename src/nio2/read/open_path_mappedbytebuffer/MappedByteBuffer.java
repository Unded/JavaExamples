package nio2.read.open_path_mappedbytebuffer;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MappedByteBuffer {
    public static void main(String[] args) {
        try(FileChannel bChn = (FileChannel) Files.newByteChannel(Paths.get("test_text.txt"))){
            java.nio.MappedByteBuffer mapBuf = bChn.map(FileChannel.MapMode.READ_ONLY, 0, bChn.size());
            for (int i = 0; i < bChn.size(); i++){
                System.out.print((char) mapBuf.get());
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
