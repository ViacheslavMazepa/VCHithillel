package com.ithillel.mazepa.ls15Game;

public class Main extends Game {

    public static void main(String[] args) {
        User me = new User();
        Skynet he = new Skynet();
        round(me.getMove(), he.getMove());

    }
}
