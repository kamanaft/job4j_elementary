package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        for (int i = 0; i < (array.length / 2); i++) {
            int temp = 0;
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = back(input);
        for (int index = 0; index < result.length; index++) {
            System.out.print(result[index] + " ");
        }
    }
}
