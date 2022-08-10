package com.kodilla.rps;

public class Instructions {

    public static void introductions() {
        System.out.println("Welcome to the Rock&Paper&Scissors game");
        System.out.print("Please input your name : ");
    }
    public Instructions() {
        System.out.println("This is the popular game of paper, rock, scissors. Enter your\n" +
                "choice by typing the number 1 \" for paper\", 2 \"for rock\" or 3\n\"" +
                "for scissors\". " +
                "The computer will also make a choice from the three\n" +
                "options. After you have entered your choice, the winner of the\n" +
                "game will be determined according to the following rules:");
        System.out.println("Paper wraps rock (paper wins)\n" +
                "Rock breaks scissors (rock wins)\n" +
                "Scissors cuts paper (scissors wins)");
        System.out.println("If both you and the computer enter the same choice, then the game is tied.");
        System.out.println("When you want to restart the game press -> n");
        System.out.println("When you want to finish the game press -> x");
        System.out.println("Good luck and have fun");
    }
}
