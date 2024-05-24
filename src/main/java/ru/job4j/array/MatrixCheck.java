package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            int flag = 0;
            if (board[row][i] == 'X') {
                flag += 1;
            }
            if (flag == board[row].length) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            int flag = 0;
            if (board[i][column] == 'X') {
                flag += 1;
                }
            if (flag == board.length) {
                result = false;
                break;
                }
        }
        return result;
    }
}
