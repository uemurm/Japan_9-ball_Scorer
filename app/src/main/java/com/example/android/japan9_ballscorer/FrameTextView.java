package com.example.android.japan9_ballscorer;

import android.app.Activity;
import android.widget.TextView;

/**
 * This is instantiated in association with each frame then provide it
 * with access to its related text views.
 */
public class FrameTextView {
    private Activity activity;
    private int rackNum;
    private int playerId;

    public FrameTextView(int rackNum, int playerId, Activity activity) {
        this.activity = activity;
        this.rackNum = rackNum;
        this.playerId = playerId;
    }

    public TextView getPocketHistory() {
        int viewId;
        viewId = activity.getResources()
                .getIdentifier(
                        "pocket_history" +
                                Integer.toString(rackNum) + "_" +
                                Integer.toString(playerId),
                        "id",
                        "com.example.android.japan9_ballscorer"
                );

        return (TextView) activity.findViewById(viewId);
    }

    public TextView getPointString() {
        int viewId;
        viewId = activity.getResources()
                .getIdentifier(
                        "point_string" +
                                Integer.toString(rackNum) + "_" +
                                Integer.toString(playerId),
                        "id",
                        "com.example.android.japan9_ballscorer"
                );

        return (TextView) activity.findViewById(viewId);
    }

    public TextView getRackScore() {
        int viewId;
        viewId = activity.getResources()
                .getIdentifier(
                        "rack_score" +
                                Integer.toString(rackNum) + "_" +
                                Integer.toString(playerId),
                        "id",
                        "com.example.android.japan9_ballscorer"
                );

        return (TextView) activity.findViewById(viewId);
    }

    public TextView getAddedScore() {
        int viewId;
        viewId = activity.getResources()
                .getIdentifier(
                        "added_score" +
                                Integer.toString(rackNum) + "_" +
                                Integer.toString(playerId),
                        "id",
                        "com.example.android.japan9_ballscorer"
                );

        return (TextView) activity.findViewById(viewId);
    }
}
