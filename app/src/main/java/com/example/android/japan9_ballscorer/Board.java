package com.example.android.japan9_ballscorer;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Rack> racks;
    private Players players;
    private int currentRack;
    private int currentPlayer;

    public Board(Players players, Activity activity) {
        racks = new ArrayList<>();
        racks.add(new Rack(0, players.size(), activity));
        racks.add(new Rack(1, players.size(), activity));

        this.players = players;
        currentRack = 0;
        currentPlayer = 0;
    }

    public void nextPlayer() {
        if (currentPlayer == players.size() - 1) {
            currentRack++;
        }
        currentPlayer = (currentPlayer + 1) % players.size();

        for (int i = 0; i < players.size(); i++) {
            if (i == currentPlayer) {
                players.getNameTextViews().get(i).setTextSize(40);
            } else {
                players.getNameTextViews().get(i).setTextSize(30);
            }
        }
    }

    public void pocket(int ballNumber, String pocketType) {
        racks.get(currentRack).pocket(ballNumber, pocketType, currentPlayer);
    }
}
