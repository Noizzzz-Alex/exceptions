package hw2.task3not;
/*
Задача3:
Напишите программу, которая запрашивает у пользователя три числа и
выполняет следующие проверки:

Если первое число больше 100, выбросить исключение NumberOutOfRangeException
с сообщением "Первое число вне допустимого диапазона".

Если второе число меньше 0, выбросить исключение NumberOutOfRangeException
с сообщением "Второе число вне допустимого диапазона".

Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException
с сообщением "Сумма первого и второго чисел слишком мала".

Если третье число равно 0, выбросить исключение DivisionByZeroException
с сообщением "Деление на ноль недопустимо".

В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".

- необходимо создать 3 класса собсвенных исключений
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberCheckOfRange numberCheckOfRange = new NumberCheckOfRange(0, 100);
        SumNumberChecker sumNumberChecker = new SumNumberChecker(10);
        CheckedByZero checkedByZero = new CheckedByZero();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three positive number");
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number: ");
        int num3 = scanner.nextInt();
        try {
            numberCheckOfRange.check(num1);
            numberCheckOfRange.check(num2);
            sumNumberChecker.isValidSum(num1, num2);
            checkedByZero.checkedByZero(num3);
            System.out.println("Проверка прошла успешно");
        } catch (NumberOutOfRangeException | NumberSumException | DivisionByZeroException e) {
            throw new RuntimeException(e);
        }

    }
}

