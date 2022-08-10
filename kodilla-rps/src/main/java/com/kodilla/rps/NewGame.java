package com.kodilla.rps;

import static com.kodilla.rps.RpsRunner.keyboard;

public class NewGame {

    // Game End
    public NewGame() {
        System.out.println("The game is finished");
        System.out.println("play again? (y/n)");
        String playAgain = keyboard.nextLine();
        if (playAgain.equals("y")) {
            System.out.println("Game will now restart");

        } else {
            System.out.println("Thank you for playing");
            keyboard.close();
        }
    }
}
