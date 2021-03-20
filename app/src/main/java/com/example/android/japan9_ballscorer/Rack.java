package com.example.android.japan9_ballscorer;

import android.app.Activity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Rack {
    private List<Frame> frames;
    private Activity activity;

    public Rack(Activity activity) {
        this.activity = activity;

        frames = new ArrayList<>();
        frames.add(new Frame(0, activity, rackScoreViews(), addedScoreViews()));
        frames.add(new Frame(1, activity, rackScoreViews(), addedScoreViews()));
        frames.add(new Frame(2, activity, rackScoreViews(), addedScoreViews()));
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

    private TextView[] rackScoreViews() {
        TextView[] views = new TextView[3];
        views[0] = (TextView) activity.findViewById(R.id.rack_score0);
        views[1] = (TextView) activity.findViewById(R.id.rack_score1);
        views[2] = (TextView) activity.findViewById(R.id.rack_score2);

        return views;
    }

    private TextView[] addedScoreViews() {
        TextView[] views = new TextView[3];
        views[0] = (TextView) activity.findViewById(R.id.added_score0);
        views[1] = (TextView) activity.findViewById(R.id.added_score1);
        views[2] = (TextView) activity.findViewById(R.id.added_score2);

        return views;
    }
}
