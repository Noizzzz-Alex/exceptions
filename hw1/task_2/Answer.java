package hw1.task_2;

class Answer {
    public int[] subArrays(int[] a, int[] b) {
        // Введите свое решение ниже
        if (!compareLength(a, b)) {
            return new int[1];
        }else {
            int[] result = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] - b[i];
            }
            return result;
        }
    }

    public boolean compareLength(int[] a, int[] b) {
        return a.length == b.length;
    }
}
