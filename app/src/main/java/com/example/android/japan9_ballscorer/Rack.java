package com.example.android.japan9_ballscorer;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class Rack {
    private         List<Frame> frames;

    public Rack(Activity activity) {
        frames = new ArrayList<>();
        frames.add(new Frame(activity));
        frames.add(new Frame(activity));
        frames.add(new Frame(activity));
    }

    public void pocket(int ballNumber, String pocketType, int playerNumber) {
        int points = frames.get(playerNumber).pocket(ballNumber, pocketType);

        int playerIndex = 0;
        for (Frame frame: frames) {
            if (playerIndex == playerNumber) {
                frame.updateScore(points * (frames.size() - 1) );
            } else {
                frame.updateScore( -(points) );
            }
            playerIndex++;
        }
    }
}
