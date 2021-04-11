package com.example.android.japan9_ballscorer;

import android.app.Activity;
import android.widget.TextView;

public class FrameTextView {
    private Activity activity;

    public FrameTextView(Activity activity) {
        this.activity = activity;
    }

    public TextView[] getPocketHistoryViews() {
        TextView[] views = new TextView[3];

        views[0] = (TextView) activity.findViewById(R.id.pocket_history0);
        views[1] = (TextView) activity.findViewById(R.id.pocket_history1);
        views[2] = (TextView) activity.findViewById(R.id.pocket_history2);

        return views;
    }

    public TextView[] getPointStringViews() {
        TextView[] views = new TextView[3];

        views[0] = (TextView) activity.findViewById(R.id.point_string0);
        views[1] = (TextView) activity.findViewById(R.id.point_string1);
        views[2] = (TextView) activity.findViewById(R.id.point_string2);

        return views;
    }

    public TextView[] getRackScoreViews() {
        TextView[] views = new TextView[3];

        views[0] = (TextView) activity.findViewById(R.id.rack_score0);
        views[1] = (TextView) activity.findViewById(R.id.rack_score1);
        views[2] = (TextView) activity.findViewById(R.id.rack_score2);

        return views;
    }

    public TextView[] getAddedScoreViews() {
        TextView[] views = new TextView[3];

        views[0] = (TextView) activity.findViewById(R.id.added_score0);
        views[1] = (TextView) activity.findViewById(R.id.added_score1);
        views[2] = (TextView) activity.findViewById(R.id.added_score2);

        return views;
    }
}
