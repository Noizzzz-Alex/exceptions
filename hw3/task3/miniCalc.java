package hw3.task3;

import hw3.task3.interfaces.*;
import hw3.task3.operations.*;
import java.io.IOException;


public class miniCalc {
    private loggable log = new Logging();
    private additionable sum = new addition();
    private divisionable div = new division();
    private exponentiationable exponent = new exponentiation();
    private multiplicationable mult = new multiplication();
    private substractionable sub = new subtraction();

    public miniCalc() {
    }


    public int addTask(int a, int b) {
        try{
            log.logOperation(
                    String.format("Сложение: %d + %d = %d \n", a, b,sum.add(a, b)),
                    "hw3/task3/files/logOperation.txt");

        }catch (IOException e){
            System.out.println("Ошибка записи в файл");
        }
        return sum.add(a, b);

    }

    public double divTask(int a, int b) {
        try{
            log.logOperation(
                    String.format("Деление: %d / %d = %.2f \n", a, b,div.divide(a, b)),
                    "hw3/task3/files/logOperation.txt");
            return div.divide(a, b);

        }catch (IOException e){
            System.out.println("Ошибка записи в файл");
        }catch (ArithmeticException e){
            System.out.println("Деление на ноль недопустимо");
        }
        return 0;
    }

    public int exponentiationTask(int a, int b) {
        try{
            log.logOperation(
                    String.format("Степень: %d ^ %d = %d \n", a, b,exponent.exponentiation(a,b)),
                    "hw3/task3/files/logOperation.txt");

        }catch (IOException e){
            System.out.println("Ошибка записи в файл");
        }
        return exponent.exponentiation(a, b);
    }

    public int multTask(int a, int b) {
        try{
            log.logOperation(
                    String.format("Умножение: %d * %d = %d \n", a, b,mult.multiply(a, b)),
                    "hw3/task3/files/logOperation.txt");

        }catch (IOException e){
            System.out.println("Ошибка записи в файл");
        }
        return a*b;
    }

    public int subTask(int a, int b) {
        try{
            log.logOperation(
                    String.format("Вычитание: %d - %d = %d \n", a, b,sub.subtract(a,b)),
                    "hw3/task3/files/logOperation.txt");

        }catch (IOException e){
            System.out.println("Ошибка записи в файл");
        }
        return sub.subtract(a, b);
    }


}
