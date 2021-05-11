package com.example.android.japan9_ballscorer;

import android.app.Activity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Players extends ArrayList {
    private Activity activity;

    public Players(Activity activity) {
        this.activity = activity;
    }

    public List<TextView> getNameTextViews() {
        List<TextView> views = new ArrayList<>();

        for (int i = 0; i < this.size(); i++) {
            int viewId;
            viewId = activity.getResources()
                             .getIdentifier(
                                     "player_name" + Integer.toString(i),
                                     "id",
                                     "com.example.android.japan9_ballscorer"
                             );
            views.add((TextView) activity.findViewById(viewId));
        }

        return views;
    }
}
