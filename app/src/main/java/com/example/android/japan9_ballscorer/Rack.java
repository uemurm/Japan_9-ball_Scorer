package com.example.android.japan9_ballscorer;

import android.app.Activity;

public class Rack {
    private Frame frames[];

    public Rack(Activity activity) {
        frames = new Frame[] {
                new Frame(activity),
                new Frame(activity),
                new Frame(activity),
        };
    }

    public void pocket(int ballNumber, String pocketType, int player) {
        frames[player].pocket(ballNumber, pocketType);
    }
}
