package hw3.task3.operations;

import hw3.task3.interfaces.exponentiationable;

public class exponentiation implements exponentiationable {
    @Override
    public int exponentiation(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
