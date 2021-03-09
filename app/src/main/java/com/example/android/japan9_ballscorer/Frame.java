package com.example.android.japan9_ballscorer;

import android.app.Activity;
import android.widget.TextView;

public class Frame {
    private String pocketedHistory;
    private int points;
    private String pointString;
    private int rackScore;
    private int addedScore;

    private Activity activity;

    public Frame(Activity activity) {
        pocketedHistory = "";
        points = 0;
        pointString = "";
        rackScore = 0;
        addedScore = 0;

        this.activity = activity;
    }

    public void pocket(int ballNumber, String pocketType) {
        pocketedHistory += String.valueOf(ballNumber) + pocketType;
        TextView scoreView = (TextView) activity.findViewById(R.id.pocketed0);
        scoreView.setText(String.valueOf(pocketedHistory));

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
