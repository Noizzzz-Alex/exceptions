package hw3.task3;
/*
Задача 3: Мини-калькулятор (ООП, исключения, коллекции) - по желанию

Создайте класс MiniCalculator, который поддерживает следующие операции:

Сложение
Вычитание
Умножение
Деление
Возведение в степень

Операции должны выполняться с использованием ООП принципов
(например, каждая операция может быть отдельным классом).
Класс должен поддерживать историю операций,
которая хранится в коллекции.
Класс также должен выбрасывать исключения при недопустимых операциях
(например, деление на ноль).
*/
public class Main {
    public static void main(String[] args) {
        miniCalc mc = new miniCalc();
        System.out.println(mc.addTask(1, 2));
        System.out.println(mc.addTask(58,43));
        System.out.println(mc.divTask(25,5));
        System.out.println(mc.exponentiationTask(5,2));
        System.out.println(mc.multTask(25,25));
        System.out.println(mc.subTask(100,23));

    }
}
