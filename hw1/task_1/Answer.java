package hw1.task_1;

class Answer {
    public  void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] arr = {1, 2, 3, 4};
        System.out.println(arr[5]);

    }

    public  void divisionByZero() {
        // Напишите свое решение ниже
        int[] arr = {1, 2, 3, 4};
        System.out.println(arr[0] / 0);

    }

    public  void numberFormatException() {
        // Напишите свое решение ниже
        String str = "Hello";
        int num = Integer.parseInt(str);
        System.out.println(num);


    }
}
