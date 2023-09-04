package hw3.task2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();



        try {
            String content = fileManager.read("/Users/aleksandrharlampov/IdeaProjects/exceptions/hw3/task2/test.txt");
            System.out.println(content);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }



        try {
            String content = "Этот текст будет записан в файл.";
            fileManager.write("/Users/aleksandrharlampov/IdeaProjects/exceptions/hw3/task2/test.txt", content);
            System.out.println("Записано успешно");
        } catch (IOException e) {
            System.out.println("Ошибка записи файла: " + e.getMessage());
        }



        try {
            fileManager.copy(
                    "/Users/aleksandrharlampov/IdeaProjects/exceptions/hw3/task2/test2.txt",
                    "/Users/aleksandrharlampov/IdeaProjects/exceptions/hw3/task2/test.txt");
            System.out.println("Файл скопирован");
        } catch (IOException e) {
            System.out.println("Ошибка при копировании файла: " + e.getMessage());
        }
    }
}
