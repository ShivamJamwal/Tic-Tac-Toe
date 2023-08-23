package com.allinonegames.Service.TicTactoe;

import java.util.Random;
import java.util.Scanner;

public class AIplayer extends Player {


    public AIplayer(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }

    public void makeMove() {
        Scanner sc = new Scanner(System.in);
        int row;
        int col;

        do {
            Random random=new Random();
            row=random.nextInt(3);
            col=random.nextInt(3);
        } while (!isValidMove(row, col));

        Tictactoe.placemark(row, col, mark);


    }

}
