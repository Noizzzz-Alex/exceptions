package hw3.task3.interfaces;

import java.io.IOException;
import java.util.ArrayList;

public interface loggable {
    public void logOperation(String operation, String filePath)throws IOException;
}
