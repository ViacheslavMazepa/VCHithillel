package com.ithillel.mazepa.ls15Game;

import java.util.Random;

public class Skynet {
    public Move move;
    Move getMove(){
        Move[] moves = Move.values();
        Random random = new Random();
        int index = random.nextInt(moves.length);
        System.out.println("terminator select: " + moves[index]);
        return moves[index];
    }
}
