package com.example.android.japan9_ballscorer;

import android.app.Activity;
import android.widget.TextView;

public class Frame {
    private String pocketHistory;
    private int points;
    private String pointString;
    private int rackScore;
    private int addedScore;

    private Activity activity;

    public Frame(Activity activity) {
        pocketHistory = "";
        points = 0;
        pointString = "";
        rackScore = 0;
        addedScore = 0;

        this.activity = activity;
    }

    public void pocket(int ballNumber, String pocketType) {
        pocketHistory += String.valueOf(ballNumber) + pocketType;
        TextView scoreView = (TextView) activity.findViewById(R.id.pocket_history0);
        scoreView.setText(String.valueOf(pocketHistory));

        switch (ballNumber) {
            case 5:
                points      += (pocketType == "S") ?  2  :  1 ;
                pointString += (pocketType == "S") ? "X" : "|";
                break;
            case 9:
                points      += (pocketType == "S") ?   4  :  2 ;
                pointString += (pocketType == "S") ? "XX" : "X";
                break;
        }
        TextView pointStrView = (TextView) activity.findViewById(R.id.point_string0);
        pointStrView.setText(String.valueOf(pointString));

    }
}
