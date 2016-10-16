package nio2.directory.simple;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
    public static void main(String[] args) {

        try(DirectoryStream<Path> dStream = Files.newDirectoryStream(Paths.get("E:\\LessonsYakovFain"),
                //Filter for directory by lambda
                entry -> Files.isDirectory(entry)

                //Filter for directory by @Override
                /*new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path entry) throws IOException {
                return Files.isDirectory(entry);
            }
        }*/
        )){
            System.out.println("Path is \"E:\\\\LessonsYakovFain\"");
            for (Path entry : dStream){
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);

                if (attributes.isDirectory()) System.out.print("<Dir> ");
                else System.out.print("<File> ");

                System.out.println(entry.getName(1));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
