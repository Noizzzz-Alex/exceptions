package hw2.task2;

public class Calc {
    public double divided(int number1, int number2) throws DivisionByZeroException {
        if (number2 == 0) {
            throw new DivisionByZeroException("divide by zero not supported");
        }
        return (double) number1 / number2;
    }
}
