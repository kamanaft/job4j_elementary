package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = false;
        int flag = 0;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] == 'X') {
                flag += 1;
            }
            if (flag == board[row].length) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = false;
        int flag = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] == 'X') {
                flag += 1;
            }
            if (flag == board.length) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            result[i] = board[i][i];
        }
        return result;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (monoHorizontal(board, i) || monoVertical(board, i)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
