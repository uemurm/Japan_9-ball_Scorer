package com.example.android.japan9_ballscorer;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Rack> racks;
    private Players players;
    private int currentRack;
    private int currentPlayer;

    public Board(Activity a) {
        racks = new ArrayList<>();
        racks.add(new Rack(a));
        racks.add(new Rack(a));

        players = new Players(a);
        players.add(new Player("山梨"));
        players.add(new Player("植村"));
        players.add(new Player("鈴木"));

        players.getNameTextViews().get(0).setText("山梨");
        players.getNameTextViews().get(1).setText("植村");
        players.getNameTextViews().get(2).setText("鈴木");
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
