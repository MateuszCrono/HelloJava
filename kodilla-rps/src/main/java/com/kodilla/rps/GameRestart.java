package com.kodilla.rps;

import static com.kodilla.rps.RpsRunner.keyboard;

public class GameRestart {

    public static GameLogic restart() {
        System.out.println("Do you want to play again? (y/n)");
        String playAgain = keyboard.nextLine();
        if (playAgain.equalsIgnoreCase("n")) {
            System.out.println("Thank you and Goodbye");
            keyboard.close();
        } else if (playAgain.equalsIgnoreCase("y")) {
            System.out.println("Thank you and Goodbye");
            System.out.println("Game will now restart");
            GameLogic gameLogic = new GameLogic();
            gameLogic.process();
        } else {
            System.out.println("Wrong input, try again !");
        }
        return null;
    }
}

