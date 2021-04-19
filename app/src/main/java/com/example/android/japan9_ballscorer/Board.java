package com.example.android.japan9_ballscorer;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Rack> racks;
    private int currentRack;
    private int currentPlayer;

    public Board(Activity activity) {
        racks = new ArrayList<>();
        racks.add(new Rack(activity));
        racks.add(new Rack(activity));

        currentRack = 0;
        currentPlayer = 0;
    }

    public void nextPlayer() {
        if (currentPlayer == 2) {
            currentRack++;
        }
        currentPlayer = (currentPlayer + 1) % 3;
    }

    public void pocket(int ballNumber, String pocketType) {
        racks.get(currentRack).pocket(ballNumber, pocketType, currentPlayer);
    }
}
