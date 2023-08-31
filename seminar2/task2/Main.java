package seminar2.task2;

public class Main {
    public static void main(String[] args) {
        try{
            throwCheckedException();
        }catch (CustomCheckedException  e){
            System.out.println("Caught checked exception" + e.getMessage());
        }
        throwUncheckedException(); //нет блока try т.к unchecked
        System.out.println("this will still be executed");

    }

    public static void throwCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException("this is checked exception");
    }

    public static void throwUncheckedException() throws CustomUncheckedException {
        throw new CustomUncheckedException("this is unchecked exception");
    }
}
