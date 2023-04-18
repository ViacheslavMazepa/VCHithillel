package com.ithillel.mazepa.ls15Game;

import java.util.Scanner;

class User {
    private Scanner scanner;
    private Move userMove;


    User() {
        scanner = new Scanner(System.in);
        setUserMove();
    }

    public Move getUserMove() {
        return userMove;
    }

    private void setUserMove() {
        System.out.println("Rock, scissors or paper");
        System.out.print("Choose one: ");
        String userInput = scanner.nextLine().toUpperCase().replaceAll("[^A-Z]", "");
        switch (userInput) {
            case "ROCK" -> userMove = Move.ROCK;
            case "PAPER" -> userMove = Move.PAPER;
            case "SCISSORS" -> userMove = Move.SCISSORS;
        }
        System.out.println("John Connor selected: " + getUserMove());
    }
}
