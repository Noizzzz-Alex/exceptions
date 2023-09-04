package hw3.task2;

import java.io.*;

public class fileManager {

    Copyable copyable = new copyFiles();
    Writeable writeable = new writeFiles();
    Readable readable = new readFiles();



    public void writeTask(String path, String content) throws IOException {
        writeable.write(path, content);
    }

    public void readTask(String path) throws IOException {
        readable.read(path);
    }


    public void copyTask(String pathCopiedFile, String pathDestinationFile) throws IOException {
        copyable.copy(pathCopiedFile, pathDestinationFile);
    }
}
