package hw2.task1;

import seminar2.task2.CustomCheckedException;

public class InvalidIdNumberException extends RuntimeException{
    public InvalidIdNumberException(String message) {
        super(message);
    }
}
