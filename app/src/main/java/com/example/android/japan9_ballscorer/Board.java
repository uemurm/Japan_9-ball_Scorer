package com.example.android.japan9_ballscorer;

import android.app.Activity;

public class Board {
    private Rack rack;
    private int currentPlayer;

    public Board(Activity activity) {
        rack = new Rack(activity);
        currentPlayer = 0;
    }

    public void nextPlayer() {
        currentPlayer = (currentPlayer + 1) % 3;
    }

    public void pocket(int ballNumber, String pocketType) {
        rack.pocket(ballNumber, pocketType, currentPlayer);
    }
}
