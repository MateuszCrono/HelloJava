package com.kodilla.rps;

import java.util.Random;

import static com.kodilla.rps.RpsRunner.keyboard;

public class GameLogic {

    // Starting Statistics
    String userName = "";
    int playerScore = 0;
    int computerScore = 0;
    int gameEndScore = 1;


    public GameLogic() {
        // Computer Moves
        while (gameEndScore > playerScore && gameEndScore > computerScore) {
            String[] rps = {"Rock", "Paper", "Scissors"};
            String computerMove = rps[new Random().nextInt(rps.length)];
            String playerMove = null;

            // Game Outcomes
            System.out.println("Please Choose your move ( 1 for Rock , 2 for Paper, 3 for Scissors )");
            playerMove = keyboard.nextLine();
            if (playerMove.equals("1")) {
                if (computerMove.equals("Paper")) {
                    System.out.println("You Lost");
                    computerScore++;
                } else if (computerMove.equals("Scissors")) {
                    System.out.println("You Won");
                    playerScore++;
                } else {
                    System.out.println("It's a tie");
                }
            } else if (playerMove.equals("2")) {
                if (computerMove.equals("Scissors")) {
                    System.out.println("You Lost");
                    computerScore++;
                } else if (computerMove.equals("Rock")) {
                    System.out.println("You Won");
                    playerScore++;
                } else {
                    System.out.println("It's a tie");
                }
            } else if (playerMove.equals("3")) {
                if (computerMove.equals("Rock")) {
                    System.out.println("You Lost");
                    computerScore++;
                } else if (computerMove.equals("Paper")) {
                    System.out.println("You Won");
                    playerScore++;
                } else {
                    System.out.println("It's a tie");
                }
            }
            System.out.println("Current score is : " + userName + " " + playerScore + " : " + computerScore + " Computer");
        }
    }
}
