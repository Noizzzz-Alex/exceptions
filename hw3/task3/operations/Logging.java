package hw3.task3.operations;

import hw3.task3.interfaces.loggable;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Logging implements loggable {


    @Override
    public void logOperation(String operation, String filePath) throws IOException {
        if (Files.exists(Paths.get(filePath))) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
                writer.write(operation);
            }
        } else {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                writer.write(operation);
            }
        }
    }
}


