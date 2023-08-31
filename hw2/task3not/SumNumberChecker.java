package hw2.task3not;

public class SumNumberChecker {
    private int minVerificationSum;

    public SumNumberChecker(int minVerificationSum) {
        this.minVerificationSum = minVerificationSum;
    }

    public boolean isValidSum(int num1, int num2) throws NumberSumException {
        if ((num1 + num2) < this.minVerificationSum) {
            throw new NumberSumException("Сумма чисел слишком мала");
        }
        return true;
    }
}
