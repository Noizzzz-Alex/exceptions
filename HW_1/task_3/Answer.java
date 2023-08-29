package HW_1.task_3;

/*
Частное двух массивов

Реализуйте метод divArrays, принимающий в качестве аргументов два целочисленных массива a и b,
и возвращающий новый массив с,
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.

Если длины массивов не равны - верните нулевой массив длины 1.

Важно: При выполнении метода единственное исключение,
которое пользователь может увидеть - RuntimeException, т.е. ваше.

Напишите свой код в методе divArrays класса Answer.
Метод divArrays принимает на вход два параметра:

    int[] a - первый массив
    int[] b - второй массив

Пример

a = new int[]{12, 8, 16};
b = new int[]{4, 2, 4};

Вывод: [3, 4, 4]

a = new int[]{12, 8, 16, 25};
b = new int[]{4, 2, 4};

Вывод: [0]


 */
class Answer {
    public int[] divArrays(int[] a, int[] b) {
        // Введите свое решение ниже
        if (!(a.length == 0 || b.length == 0)) {

            if (!compareLength(a, b)) {
                return new int[1];
            } else {
                int[] result = new int[a.length];
                for (int i = 0; i < a.length; i++) {
                    result[i] = a[i] / b[i];
                }
                return result;
            }
        }
        throw new RuntimeException("Массивы не должны быть пустыми!");
    }

    public boolean compareLength(int[] a, int[] b) {
        return a.length == b.length;
    }
}

