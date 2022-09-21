package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        GameLogic gameLogic = new GameLogic();
        Instructions.introductions();
        gameLogic.userName = keyboard.nextLine();
        System.out.println("Do you need instructions? \npress y to show game instructions\npress any other key if you dont want to read instructions");
        String readInstruction = keyboard.nextLine();
        if (readInstruction.equalsIgnoreCase("y")) new Instructions();
        boolean wantsToContinue = true;
        while (wantsToContinue) {
            gameLogic.process();
            wantsToContinue = GameRestart.restart();
        }
        System.out.println("Thank you for playing and see you next time !");
    }
}
