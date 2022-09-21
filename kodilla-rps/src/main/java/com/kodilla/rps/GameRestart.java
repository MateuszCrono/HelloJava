package com.kodilla.rps;

import static com.kodilla.rps.RpsRunner.keyboard;

public class GameRestart {

    public static boolean restart() {
        System.out.println("Press Y if you want to play again");
        String playAgain = keyboard.nextLine();
        if (playAgain.equalsIgnoreCase("y")) {
            System.out.println("Restarting the game");
            return true;
        } else {
            System.out.println("Thank you and Goodbye");
            keyboard.close();
            return false;
        }
    }
}

