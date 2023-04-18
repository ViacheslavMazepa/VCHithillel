package com.ithillel.mazepa.ls15Game;

import java.util.Random;

class Skynet {
    private Move skynetMove;

    Skynet() {
        setSkynetMove();
    }

    public Move getSkynetMove() {
        return skynetMove;
    }
    private void setSkynetMove() {
        Move[] moves = Move.values();
        Random random = new Random();
        int index = random.nextInt(moves.length);
        System.out.println("Terminator select: " + moves[index]);
        skynetMove = moves[index];
    }
}
