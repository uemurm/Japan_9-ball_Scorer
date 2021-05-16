package com.example.android.japan9_ballscorer;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

public class Rack {
    private List<Frame> frames;

    public Rack(int rackIdx, int playerCount, Activity activity) {
        FrameTextView frameTextView;

        frames = new ArrayList<>();
        for (int i = 0; i < playerCount; i++) {
            frameTextView = new FrameTextView(rackIdx, i, activity);
            frames.add(new Frame(frameTextView));
        }
    }

    public void pocket(int ballNumber, String pocketType, int playerId) {
        int points = frames.get(playerId).pocket(ballNumber, pocketType);

        int frameIndex = 0;
        for (Frame frame: frames) {
            if (frameIndex == playerId) {
                frame.updateScore(points * (frames.size() - 1) );
            } else {
                frame.updateScore( -(points) );
            }
            frameIndex++;
        }
    }
}
