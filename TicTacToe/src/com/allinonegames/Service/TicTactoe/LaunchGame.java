package com.allinonegames.Service.TicTactoe;
import java.sql.SQLOutput;
import java.util.Scanner;

public class LaunchGame {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]) { 
        Constant.constant();
         Tictactoe.initBoard();
        System.out.println("Enter the player name");
         String name= sc.nextLine();
        System.out.println("Your name is"+name);
        System.out.println("Your mark is------- X--------");
        System.out.println();
        HumanPlayer p1 = new HumanPlayer(name, 'X');
        AIplayer p2=new AIplayer("AI",'0');
        Player cp;
        cp = p1;
        while (true) {
            System.out.println(cp.name + "turn");
            cp.makeMove();
            Tictactoe.displayBoard();
            if (Tictactoe.checkColWin() || Tictactoe.checkRowWin() || Tictactoe.diagonalWin()) {
                System.out.println(cp.name + "has won");
                break;
            } else if (Tictactoe.checkDraw()) {
                System.out.println("Game is draw");
break;
            } else {

                if (cp == p1) {
                    cp=p2;
                } else {
                    cp = p1;
                }
            }
        }
    }
}