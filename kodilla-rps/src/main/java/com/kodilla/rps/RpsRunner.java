package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        // Initial Statistics
        String userName = "";
        int playerScore = 0;
        int computerScore = 0;
        int gameEndScore = 1;

        // Game Setup
        Instructions.introductions();
        userName = keyboard.nextLine();
        System.out.println("Do you need instructions? \npress y to show game instructions\npress any other key if you dont want to read instructions");
        String help = keyboard.nextLine();
        if (help.equalsIgnoreCase("y")) new Instructions();
        System.out.print("To how many points you want to play the game ?? : ");
        gameEndScore = Integer.valueOf(keyboard.nextLine());
        // The Game
        new GameLogic();
        // Game End
        new NewGame();
    }

}


