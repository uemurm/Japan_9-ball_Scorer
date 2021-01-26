package com.example.android.japan9_ballscorer;

public class Board {
    private Rack rack;
    private int currentPlayer;

    public Board() {
        rack = new Rack();
        currentPlayer = 0;
    }

    public void setCurrentPlayer(int n) {
        currentPlayer = n;
    }
}
