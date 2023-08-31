package hw2.task1;

import java.util.Scanner;

/*
Задача 1:
Напишите программу, которая запрашивает у пользователя число и проверяет,
является ли оно положительным. Если число отрицательное или равно нулю,
программа должна выбрасывать исключение InvalidNumberException
с сообщением "Некорректное число". В противном случае,
программа должна выводить сообщение "Число корректно".
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter positive number :");
        int x = scanner.nextInt();
        if (!CheckerPositiveNumber.checkNumber(x)){
            throw new InvalidIdNumberException("incorrect number");
        }else {
            System.out.println("correct number");
        }


    }
}
