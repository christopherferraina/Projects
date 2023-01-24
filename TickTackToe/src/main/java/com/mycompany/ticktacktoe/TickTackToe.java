/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ticktacktoe;

import java.util.*;

/**
 *
 * @author ngbre
 */
public class TickTackToe {

    public int reward2;

    public ReturnMove Max(String[] Board) {
        ReturnMove rm = new ReturnMove();
        System.out.println("in Max");
        // goal get 3 X in a row

        PrintBoard(Board);
        if (CheckWinner(Board) == "O") {
            System.out.println("winner of O in max");
            rm.placeMent = -10;
            rm.utility = -1;
            return rm;
        }
        if (CheckWinner(Board) == "X") {
            System.out.println("winner of X in max");
            rm.placeMent = -10;
            rm.utility = 1;
            return rm;
        }
        // Return with a 0 if you have a draw 
        if (CheckWinner(Board) == "draw") {
            System.out.println("Draw on max");
            rm.placeMent = -10;
            rm.utility = 0;
            return rm;
        }
        
        rm.utility = -200;
        rm.placeMent = -10;
        
        // generate next states and call min for those states
        for (int i = 0; i < 9; i++) {

            // check each square with x
           if( Board[i] != "X" && Board[i] != "O")
           {
            System.out.println("Call Min");
         Board[i] = "X";   
            ReturnMove rm2 = Min(Board);
            
            System.out.println("Out Min");
            if (rm2.utility > rm.utility) {

                rm.utility = rm2.utility;
                rm.placeMent = i;
            }

            //  Board[i] = String.valueOf(i);
        }
        }
        return rm;
    }

    public ReturnMove Min(String[] Board) {
        PrintBoard(Board);
        System.out.println("in Min");
        ReturnMove rm = new ReturnMove();
        // goal dont let 3 O in a row

        if (CheckWinner(Board) == "O") {
            System.out.println("winner of O in min");
            rm.placeMent = 10;
            rm.utility = 1;
            return rm;
        }
        if (CheckWinner(Board) == "X") {
            System.out.println("winner of X in min");
            rm.placeMent = -10;
            rm.utility = -1;
            return rm;
        }
        if (CheckWinner(Board) == "draw") {
            System.out.println("draw min");
            rm.placeMent = 0;
            rm.utility = 0;
            return rm;
        }
       
        for (int i = 0; i < 9; i++) {
            if( Board[i] != "X" && Board[i] != "O"){
            Board[i] = "O";
            System.out.println("Call Max");
            ReturnMove rm2 = Max(Board);
            
            System.out.println("Out Max");
            if (rm2.utility > rm.utility) {

                 rm.utility = rm2.utility;
                rm.placeMent = i;
            }
            //   Board[i] = String.valueOf(i);
        }
        }
        return rm;
    }

    public void PrintBoard(String[] Board) {
        System.out.println("|---|---|---|");
        System.out.println("| " + Board[0] + " | "
                + Board[1] + " | " + Board[2]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + Board[3] + " | "
                + Board[4] + " | " + Board[5]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + Board[6] + " | "
                + Board[7] + " | " + Board[8]
                + " |");
        System.out.println("|---|---|---|");
    }

    public String CheckWinner(String[] Board) {
        String Line = null;

        for (int I = 0; I < 8; I++) {
            switch (I) {
                case 0:
                    Line = Board[0] + Board[1] + Board[2];
                    break;

                case 1:
                    Line = Board[3] + Board[4] + Board[5];
                    break;
                case 2:
                    Line = Board[6] + Board[7] + Board[8];
                    break;
                case 3:
                    Line = Board[0] + Board[3] + Board[6];
                    break;
                case 4:
                    Line = Board[1] + Board[4] + Board[7];
                    break;
                case 5:
                    Line = Board[2] + Board[5] + Board[8];
                    break;
                case 6:
                    Line = Board[0] + Board[4] + Board[8];
                    break;
                case 7:
                    Line = Board[2] + Board[4] + Board[6];
                    break;
            }
            //  System.out.println("for i of " + I + " line is: " + Line);

            if (Line.equals(new String("XXX"))) {
                System.out.println("X has Won");
                return "X";
            } else if (Line.equals(new String("OOO"))) {
                System.out.println("O Has Won");
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(Board).contains(
                    String.valueOf(a + 1))) {
                break;
            } else if (a == 8) {
                System.out.println("The Game is a Draw");
                return "draw";
            }
        }

        return null;
    }

    public static void main(String[] args) {
        TickTackToe ttt = new TickTackToe();
        ttt.play();
    }

    public void play() {
        String[] Board;
        boolean turn = true;
        String Winner = null;
String[] Board2;
        System.out.println("enter play");
        Scanner sc = new Scanner(System.in);
        Board = new String[9];

        // baord size of 3 
        // initializin the board
        for (int P = 0; P < 9; P++) {
            Board[P] = String.valueOf(P);
        }

        System.out.println("Board Size is 3");
        System.out.println("X plays First");
        System.out.println("Starting Board");

        PrintBoard(Board);

        while (Winner == null) {
// Print Empty Board
 System.out.println("Start of loop ");
  System.out.println(turn);
            int Placement = 10;
            if (turn == false) {
                System.out.println("select a Location to Chose from 0 to 8 ");
                Placement = sc.nextInt();

                try {
                    if (Placement < 0 || Placement > 8) // Checking for winner
                    {
                        System.out.println("Invalid Location Try again");
                        continue;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Invalid Location Try again");
                    continue;
                }

                System.out.println("Placement is: " + Placement);

                try {
                    if (Board[Placement] == "X" || Board[Placement] == "O") {
                        System.out.println("This locaion is taken Try again");
                        continue;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("This locaion is taken Try again");
                    continue;
                }
            }
            // X's turn
            if (turn == true) {
                System.out.println("entering Max");
                Board2 = Board.clone();
                Placement = Max(Board2).placeMent;

                System.out.println("about to place and X at position " + Placement);
                Board[Placement] = "X";
               
                turn = false;
                System.out.println("end");
            } 
           else{

                System.out.println("about to place an O at position " + Placement);

                Board[Placement] = "O";
                turn = true;
            }

            System.out.println("Checking for winner");
            PrintBoard(Board);

            Winner = CheckWinner(Board);
            if (Winner == null) {
                System.out.println("No one has Won Continuing Game");
            }
        }
    }

}
