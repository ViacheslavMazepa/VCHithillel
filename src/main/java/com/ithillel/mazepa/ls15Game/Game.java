package com.ithillel.mazepa.ls15Game;

public class Game {
    static private int usersWins = 0;
    static private int terminatorsWins = 0;
    public static void round(Move usersMove, Move terminatorsMove){
        if (usersMove.ordinal() == terminatorsMove.ordinal()){
            System.out.println("draw");
        } else if (usersMove == Move.ROCK && terminatorsMove == Move.SCISSORS || usersMove == Move.SCISSORS && terminatorsMove == Move.PAPER || usersMove == Move.PAPER && terminatorsMove == Move.ROCK){
            ++usersWins;
            System.out.println("Humanity won the battle but not the war");
            System.out.println("Score: " + usersWins + " : " + terminatorsWins);
        } else if (terminatorsMove == Move.ROCK && usersMove == Move.SCISSORS || terminatorsMove == Move.SCISSORS && usersMove == Move.PAPER || terminatorsMove == Move.PAPER && usersMove == Move.ROCK){
            ++terminatorsWins;
            System.out.println("Skynet is one step closer to victory");
            System.out.println("Score: " + usersWins + " : " + terminatorsWins);
        }
    }
}
