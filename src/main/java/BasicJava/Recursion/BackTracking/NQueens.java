package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    static List<List<String>> allBoards = new ArrayList<>();

    public static void main(String[] args) {
        int n = 4;

        char[][] board = new char[n][n];

        placeQueen(allBoards, board, 0);

        System.out.println(allBoards);

    }

    public static void save(char[][] board, List<List<String>> allBoards) {
        List<String> newB = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            String row = "";
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
                newB.add(row);
            }
        }
        allBoards.add(newB);

    }

    public static void placeQueen(List<List<String>> allBoards, char[][] board, int col) {
        if (col == board.length) {

            save(board, allBoards);
            return;
        }

        for (int row = 0; row < board.length; row++) {

            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                placeQueen(allBoards, board, col + 1);
                board[row][col] = '.';
            }

        }

    }

    public static boolean isSafe(int row, int col, char[][] board) {
        // row 0 col 1

        // horizontal
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }

        // verticle
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // upperLeft
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }

        }

        // upperRight
        for (int r = row, c = col; r >= 0 && c < board.length; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }

        }

        // lowerLeft
        for (int r = row, c = col; r < board.length && c >= 0; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }

        }

        // lowerRight
        for (int r = row, c = col; r < board.length && c < board.length; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }

        }

        return true;

    }

}
