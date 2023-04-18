package com.ithillel.mazepa.ls16Exception.option2;

import java.util.InputMismatchException;
import java.util.Scanner;

class Game {
    private int usersWins;
    private int terminatorsWins;
    private boolean willContinue;

    public Game() {
        this.usersWins = 0;
        this.terminatorsWins = 0;
        this.willContinue = true;
    }

    public void accessAndGame() {
        System.out.print("How old are you?: ");
        try {
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();
            if (age < 18) {
                throw new AssertionError();
            } else startGame();
        } catch (InputMismatchException e) {
            System.out.print("Wrong input =P");
        } catch (AssertionError e) {
            System.out.print("You are too young ¯\\_(ツ)_/¯");
        }
    }

    public void startGame() {
        while (willContinue) {
            try {
                //object is created in a loop to update the value each iteration
                User user = new User();
                Skynet terminator = new Skynet();

                if (user.getUserMove().ordinal() == terminator.getSkynetMove().ordinal()) {
                    System.out.println("Draw");
                    System.out.println("Score: " + usersWins + " : " + terminatorsWins);
                } else if (user.getUserMove() == Move.ROCK && terminator.getSkynetMove() == Move.SCISSORS
                        || user.getUserMove() == Move.SCISSORS && terminator.getSkynetMove() == Move.PAPER
                        || user.getUserMove() == Move.PAPER && terminator.getSkynetMove() == Move.ROCK) {
                    ++usersWins;
                    System.out.println("Humanity won the battle but not the war!");
                    System.out.println("Score: " + usersWins + " x " + terminatorsWins);
                } else if (terminator.getSkynetMove() == Move.ROCK && user.getUserMove() == Move.SCISSORS
                        || terminator.getSkynetMove() == Move.SCISSORS && user.getUserMove() == Move.PAPER
                        || terminator.getSkynetMove() == Move.PAPER && user.getUserMove() == Move.ROCK) {
                    ++terminatorsWins;
                    System.out.println("Skynet is one step closer to victory!");
                    System.out.println("Score: " + usersWins + " x " + terminatorsWins);
                }
            } catch (Exception e) {
                System.out.println("Hey dude, invalid input!");
            } finally {
                System.out.println("Сhoose again =Р");
            }

            try {
                //scanner is created in a loop to update the value each iteration
                Scanner scanner = new Scanner(System.in);

                System.out.print("Shall continue?(true/false): ");
                willContinue = scanner.nextBoolean();

                if (!willContinue) {
                    if (usersWins == terminatorsWins) {
                        System.out.print("Draw, ");
                    } else if (usersWins > terminatorsWins) {
                        System.out.print("Humans Wins, ");
                    } else System.out.print("Skynet Win, ");
                    System.out.print("Gave over!");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Dude, you picked the wrong one");
            }
        }
    }
}
