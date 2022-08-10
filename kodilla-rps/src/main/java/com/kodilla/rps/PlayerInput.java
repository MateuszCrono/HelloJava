package com.kodilla.rps;

import static com.kodilla.rps.RpsRunner.keyboard;

public class PlayerInput {

    String playerMove = null;

    public void playerInput() {
        while (true) {
            System.out.println("Please Choose your move ( 1 for Rock , 2 for Paper, 3 for Scissors )");
            playerMove = keyboard.nextLine();
            if (playerMove.equals("1") || playerMove.equals("2") || playerMove.equals("3")) {
                break;
            } else if (playerMove.equalsIgnoreCase("n")) {
                System.out.println("Are you sure you want to play a new game? (y/n)");
                if (playerMove.equalsIgnoreCase("y")) {

                } else if (playerMove.equalsIgnoreCase("n")) {
                    break;
                }
            } else if (playerMove.equalsIgnoreCase("x")) {
                System.out.println("Are you sure you want to finish the game? (y/n)");
                if (playerMove.equalsIgnoreCase("y")) {
                    System.out.println("Thank you for playing");
                    keyboard.close();
                } else if (playerMove.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("Wrong input, please try again");
                }
            }
        }
    }
}
