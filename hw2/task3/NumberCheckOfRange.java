package hw2.task3;

public class NumberCheckOfRange {
    private int startRange;
    private int finishRange;

    public NumberCheckOfRange(int startRange, int finishRange) {
        this.startRange = startRange;
        this.finishRange = finishRange;
    }

    public boolean check(int num) throws NumberOutOfRangeException {
        if (num < startRange || num > finishRange) {
            throw new NumberOutOfRangeException("Число вне допустимого диапазона");
        }
        return true;
    }

}
