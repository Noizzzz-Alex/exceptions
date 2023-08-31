package seminar2.task3;

public class Main {
    public static void main(String[] args) {
        // Пример использования класса Calculator
        Calculator calculator = new Calculator();

        try {
            double result = calculator.divide(10, 2);
            System.out.println("Division result: " + result);

            result = calculator.divide(5, 0);
            System.out.println("Division result: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error details: " + e.getErrorDetails());
        }
    }
}


// Класс исключения для деления на ноль
class DivisionByZeroException extends Exception {
    private double dividend;
    private double divisor;

    public DivisionByZeroException(String message, double dividend, double divisor) {
        super(message);
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public double getDividend() {
        return dividend;
    }

    public double getDivisor() {
        return divisor;
    }

    public String getErrorDetails() {
        return "Dividend: " + dividend + ", Divisor: " + divisor;
    }
}

// Класс калькулятора
class Calculator {
    public double divide(double dividend, double divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Division by zero is not allowed.", dividend, divisor);
        }
        return dividend / divisor;
    }
}

