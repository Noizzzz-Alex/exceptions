package hw3.task2;

import java.io.*;

public class FileManager {
    public String read(String path) throws IOException, FileNotFoundException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    public void write(String path, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(content);
        }
    }

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
