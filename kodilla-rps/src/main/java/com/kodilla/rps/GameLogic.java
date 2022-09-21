package com.kodilla.rps;

import java.util.Random;

import static com.kodilla.rps.RpsRunner.keyboard;

public class GameLogic {

    // Starting Statistics
    String userName = "";
    int playerScore = 0;
    int computerScore = 0;
    int gameEndScore = 1;

    public GameLogic process() {

        System.out.print("To how many points you want to play the game ?? : ");
        gameEndScore = Integer.valueOf(keyboard.nextLine());
        // Computer Moves
        while (gameEndScore > playerScore && gameEndScore > computerScore) {
            String[] rps = {"Rock", "Paper", "Scissors"};
            String computerMove = rps[new Random().nextInt(rps.length)];
            String playerMove = null;

            // Game Outcomes
            System.out.println("Please Choose your move ( 1 for Rock , 2 for Paper, 3 for Scissors )");
            playerMove = keyboard.nextLine();

            if (playerMove.equalsIgnoreCase("X")) {
                System.out.println("Are you sure you want to restart the game? (press Y for yes or any other key to get back to the game)");
                playerMove = keyboard.nextLine();
                if (playerMove.equalsIgnoreCase("y")) {
                    System.out.println("Thank you for playing");
                    GameRestart.restart();
                } else {
                    System.out.println("Coming back to the game");
                }
            } else if (playerMove.equals("1")) {
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
            else {
                System.out.println("Wrong input, try again");
            }
            System.out.println("Current score is : " + userName + " " + playerScore + " : " + computerScore + " Computer");
        }
        System.out.println("Game is Finished, Thank you for playing");
        playerScore = 0;
        computerScore = 0;
        return null;
    }
}

