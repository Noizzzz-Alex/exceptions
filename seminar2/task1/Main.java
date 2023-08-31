package seminar2.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("insert first positive number: ");
        System.out.println();
        int num1 = scanner.nextInt();
        System.out.print("insert second positive number: ");
        int num2 = scanner.nextInt();

        try {
            if (num1 <= 0 || num2 <= 0) {
                throw new NegativeNumberException("insert negative number or zero");
            }
            System.out.println("select operation (+ for addition, / for division)");
            char operation = scanner.next().charAt(0);
            switch (operation) {
                case '+':
                    int sum = num1 + num2;
                    System.out.println("result = " + sum);
                    break;
                case '/':
                    if (num2 == 0){
                        throw new DivisionByZeroException("divide by zero not supported");
                    }
                    double div = num1 / num2;
                    System.out.println("result = " + div);
                    break;
                default:
                    System.out.println("operation incorrect, please insert correct data");

            }
        } catch (NegativeNumberException | DivisionByZeroException e) {
            System.out.println("Fault: " + e.getMessage());

        }
        scanner.close();
    }
}
