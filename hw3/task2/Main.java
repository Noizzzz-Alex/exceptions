package hw3.task2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        fileManager fileManager = new fileManager();



        try {
            fileManager.readTask(
                    "/Users/aleksandrharlampov/IdeaProjects/exceptions/hw3/task2/test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }



        try {
            String content = "Этот текст будет записан в файл.";
            fileManager.writeTask(
                    "/Users/aleksandrharlampov/IdeaProjects/exceptions/hw3/task2/test.txt", content);
            System.out.println("Записано успешно");
        } catch (IOException e) {
            System.out.println("Ошибка записи файла: " + e.getMessage());
        }



        try {
            fileManager.copyTask(
                    "/Users/aleksandrharlampov/IdeaProjects/exceptions/hw3/task2/test2.txt",
                    "/Users/aleksandrharlampov/IdeaProjects/exceptions/hw3/task2/test.txt");
            System.out.println("Файл скопирован");
        } catch (IOException e) {
            System.out.println("Ошибка при копировании файла: " + e.getMessage());
        }
    }
}
