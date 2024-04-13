package ru.job4j.array;

public class MinDiapason {
    @SuppressWarnings("checkstyle:ParenPad")
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
