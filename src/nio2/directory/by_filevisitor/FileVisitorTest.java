package nio2.directory.by_filevisitor;


import nio2.directory.simple.MyFileVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileVisitorTest {
    public static void main(String[] args) {

        String dirName = "E:\\LessonsYakovFain";

        System.out.println("Dir tree: " + dirName);
        try{
            Files.walkFileTree(Paths.get(dirName), new MyFileVisitor());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
