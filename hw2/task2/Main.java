package hw2.task2;

import java.util.Scanner;

/*
Задача 2:
Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException
с сообщением "Деление на ноль недопустимо".
В противном случае, программа должна выводить результат деления.

Обратите внимание, что в обоих задачах используются собственные исключения,
которые наследуются от класса Exception.
Это позволяет нам определить специфическую причину ошибки и
передать информацию об ошибке для последующей обработки.
 */
public class Main {
    public static void main(String[] args) throws DivisionByZeroException {
        Calc calc = new Calc();
        double result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number:");
        int num1 = scanner.nextInt();
        System.out.println("Insert second number:");
        int num2 = scanner.nextInt();
        result = calc.divided(num1, num2);
        System.out.println(result);
    }
}
