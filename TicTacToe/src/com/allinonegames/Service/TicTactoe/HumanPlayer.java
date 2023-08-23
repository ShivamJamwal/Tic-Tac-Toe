package com.allinonegames.Service.TicTactoe;

import java.util.Scanner;
public class HumanPlayer extends Player {

    public HumanPlayer(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }

    public void makeMove() {
        Scanner sc = new Scanner(System.in);
        int row;
        int col;

        do {

            System.out.println("Enter the row and column");
            row = sc.nextInt();
            col = sc.nextInt();
        } while (!isValidMove(row, col));


        Tictactoe.placemark(row, col, mark);


    }

}