package com.ithillel.mazepa.ls15Game;

import java.util.Scanner;

public class User {
    private Scanner scanner;
    private Move move;
    private String input;

    public User() {
        scanner = new Scanner(System.in);
    }

    Move getMove() {
        System.out.println("rock, scissors or paper");
        System.out.print("choose: ");
        input = scanner.nextLine().toUpperCase().replaceAll("[^A-Z]", "");
        switch (input) {
            case "ROCK" -> move = Move.ROCK;
            case "PAPER" -> move = Move.PAPER;
            case "SCISSORS" -> move = Move.SCISSORS;
        }
        System.out.println("Conor select: " + move);
        return move;
    }
}
