package com.example.android.japan9_ballscorer;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

public class Rack {
    private List<Frame> frames;

    public Rack(Activity activity) {
        FrameTextView frameTextView = new FrameTextView(activity);

        frames = new ArrayList<>();
        frames.add(new Frame(0, frameTextView));
        frames.add(new Frame(1, frameTextView));
        frames.add(new Frame(2, frameTextView));
    }

    public void pocket(int ballNumber, String pocketType, int playerNumber) {
        int points = frames.get(playerNumber).pocket(ballNumber, pocketType);

        int frameIndex = 0;
        for (Frame frame: frames) {
            if (frameIndex == playerNumber) {
                frame.updateScore(points * (frames.size() - 1) );
            } else {
                frame.updateScore( -(points) );
            }
            frameIndex++;
        }
    }
}
