package com.kodilla.rps;

import com.sun.tools.javac.Main;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {


    static Scanner keyboard = new Scanner(System.in);

    public static void introductions() {
        System.out.println("Welcome to the Rock&Paper&Scissors game");
    }

    public static void instructions() {
        System.out.println("This is the popular game of paper, rock, scissors. Enter your\nchoice by typing the number 1 \" for paper\", 2 \"for rock\" or 3\n\"for scissors\". The computer will also make a choice from the three\noptions. After you have entered your choice, the winner of the\ngame will be determined according to the following rules:");
        System.out.println("Paper wraps rock (paper wins)\nRock breaks scissors (rock wins)\nScissors cuts paper (scissors wins)");
        System.out.println("If both you and the computer enter the same choice, then the game is tied.");
        System.out.println("When you want to restart the game press -> n");
        System.out.println("When you want to finish the game press -> x");
        System.out.println("Good luck and have fun");
    }


    public static void resetGame() {
        System.out.println("Game is Resetting");
        // Nie wiem jak wywolac zresetowanie gry
    }


    public static void main(String[] args) {

        String userName = "";
        int playerScore = 0;
        int computerScore = 0;
        int gameEndScore = 1;

        introductions();
        System.out.print("Please input your name : ");
        userName = keyboard.nextLine();
        System.out.println("Do you need instructions? \npress y to show game instructions\npress any other key if you dont want to read instructions");
        String help = keyboard.nextLine();
        if (help.equalsIgnoreCase("y")) instructions();
        System.out.print("To how many points you want to play the game ?? : ");
        gameEndScore = keyboard.nextInt();

        while (gameEndScore > playerScore && gameEndScore > computerScore) {
            String[] rps = {"Rock", "Paper", "Scissors"};
            String computerMove = rps[new Random().nextInt(rps.length)];
            String playerMove = null;


            while (true) {
                System.out.println("Please Choose your move ( 1 for Rock , 2 for Paper, 3 for Scissors )");
                playerMove = keyboard.nextLine();
                if (playerMove.equals("1") || playerMove.equals("2") || playerMove.equals("3")) {
                    break;
                } else if (playerMove.equalsIgnoreCase("n")) {
                    System.out.println("Are you sure you want to play a new game? (y/n)");
                    if (playerMove.equalsIgnoreCase("y")) {
                        // Nie wiem jak wywolac zresetowanie gry
                    } else if (playerMove.equalsIgnoreCase("n")) {

                        // Nie wiem jak wywolac zresetowanie gry
                    }
                } else if (playerMove.equalsIgnoreCase("x")) {
                    System.out.println("Are you sure you want to finish the game? (y/n)");
                    if (playerMove.equalsIgnoreCase("y")) {

                        // Nie wiem jak wywolac zresetowanie gry
                    } else if (playerMove.equalsIgnoreCase("n")) {

                        // Nie wiem jak wywolac zresetowanie gry
                    } else {
                        System.out.println("Wrong input, please try again");
                    }
                }
            }

            System.out.println("Computer plays : " + computerMove);


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
        System.out.println("The game is finished");
        System.out.println("play again? (y/n)");
        String playAgain = keyboard.nextLine();
        if (playAgain.equals("y")) {
            RpsRunner.resetGame();
        } else {
            System.out.println("Thank you for playing");
            keyboard.close();
        }
    }

}


