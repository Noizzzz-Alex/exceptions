package hw3.task2;

import java.io.*;

public class copyFiles implements Copyable{
    @Override
    public void copy(String pathCopiedFile, String pathDestinationFile) throws IOException {
        File sourceFile = new File(pathCopiedFile);
        File destinationFile = new File(pathDestinationFile);

        try (
                InputStream inputStream = new FileInputStream(sourceFile);
                OutputStream outputStream = new FileOutputStream(destinationFile)
        ){
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        }
    }
}
