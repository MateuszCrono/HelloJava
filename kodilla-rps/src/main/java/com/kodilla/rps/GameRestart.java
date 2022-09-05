package com.kodilla.rps;

import static com.kodilla.rps.RpsRunner.keyboard;

public class GameRestart {

    public static void restart() {
        GameLogic gameLogic = new GameLogic();
        System.out.println("Do you want to play again? (y/n)");
        String playAgain = keyboard.nextLine();
        while (!playAgain.equals("y"))
            if (playAgain.equalsIgnoreCase("n")) {
                System.out.println("Thank you and Goodbye");
                keyboard.close();
                break;
            } else {
                System.out.println("Wrong input, please try again");
                restart();
            }
        System.out.println("Game will now restart");
        gameLogic.process();
    }
}
