package hw3.task3.operations;

import hw3.task3.interfaces.divisionable;

public class division implements divisionable {
    @Override
    public double divide(double a, double b) throws ArithmeticException {
        return a / b;
    }
}
