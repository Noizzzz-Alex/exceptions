package hw3.task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writeFiles implements Writeable{
    @Override
    public void write(String path, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(content);
        }
    }
}
