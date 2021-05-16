package com.example.android.japan9_ballscorer;

import android.app.Activity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FrameTextView {
    private Activity activity;
    private int playerCount;

    public FrameTextView(int playerCount, Activity activity) {
        this.activity = activity;
        this.playerCount = playerCount;
    }

    public List<TextView> getPocketHistoryViews() {
        List<TextView> views = new ArrayList<>();

        for (int i = 0; i < playerCount; i++) {
            int viewId;
            viewId = activity.getResources()
                             .getIdentifier(
                                     "pocket_history" + Integer.toString(i),
                                     "id",
                                     "com.example.android.japan9_ballscorer"
                             );
            views.add((TextView) activity.findViewById(viewId));
        }

        return views;
    }

    public TextView getPocketHistoryView(int rack, int player) {
        int viewId;
        viewId = activity.getResources()
                .getIdentifier(
                        "pocket_history" +
                                Integer.toString(rack) + "_" +
                                Integer.toString(player),
                        "id",
                        "com.example.android.japan9_ballscorer"
                );

        return (TextView) activity.findViewById(viewId);
    }

    public List<TextView> getPointStringViews() {
        List<TextView> views = new ArrayList<>();

        for (int i = 0; i < playerCount; i++) {
            int viewId;
            viewId = activity.getResources()
                             .getIdentifier(
                                     "point_string" + Integer.toString(i),
                                     "id",
                                     "com.example.android.japan9_ballscorer"
                             );
            views.add((TextView) activity.findViewById(viewId));
        }

        return views;
    }

    public List<TextView> getRackScoreViews() {
        List<TextView> views = new ArrayList<>();

        for (int i = 0; i < playerCount; i++) {
            int viewId;
            viewId = activity.getResources()
                    .getIdentifier(
                            "rack_score" + Integer.toString(i),
                            "id",
                            "com.example.android.japan9_ballscorer"
                    );
            views.add((TextView) activity.findViewById(viewId));
        }

        return views;
    }

    public List<TextView> getAddedScoreViews() {
        List<TextView> views = new ArrayList<>();

        for (int i = 0; i < playerCount; i++) {
            int viewId;
            viewId = activity.getResources()
                    .getIdentifier(
                            "added_score" + Integer.toString(i),
                            "id",
                            "com.example.android.japan9_ballscorer"
                    );
            views.add((TextView) activity.findViewById(viewId));
        }

        return views;
    }
}
