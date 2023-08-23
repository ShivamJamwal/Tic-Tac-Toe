package com.allinonegames.Service.TicTactoe;

import java.util.Scanner;

public class Tictactoe {
    static char[][] board = new char[3][3];

    public static void initBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
    }

    public static void displayBoard() {

        System.out.println("----------");
        for (int row = 0; row < board.length; row++) {
            System.out.print("| ");
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + "| ");
            }
            System.out.println();
            System.out.println("----------");

        }
    }

    public static void placemark(int row, int col, char mark) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            board[row][col] = mark;
        } else {
            System.out.println("invalid position");
        }

    }

    public static boolean checkColWin() {
        for (int col = 0; col <= 2; col++) {
            if (board[0][col] != ' ' && board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
                return true;
            }
        }
        return false;

    }

    public static boolean checkRowWin() {
        for (int row = 0; row <= 2; row++) {
            if (board[row][0] != ' ' && board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
                return true;
            }

        }
        return false;

    }

    public static boolean diagonalWin() {
        if ((board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) || (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0])) {
            return true;
        }
        return false;

    }

    static boolean checkDraw() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == ' ') {
                    return false;
                }

            }
        }
        return true;
    }
}

