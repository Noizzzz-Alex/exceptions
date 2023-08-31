package hw2.task3;

public class CheckedByZero {
    private final int verification;

    public CheckedByZero() {
        this.verification = 0;
    }

    public boolean checkedByZero(int num) throws DivisionByZeroException {
        if (num == verification) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return true;
    }
}
