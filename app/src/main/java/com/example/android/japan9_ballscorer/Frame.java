package com.example.android.japan9_ballscorer;

import android.app.Activity;
import android.widget.TextView;

public class Frame {
    private String pocketHistory;
    private String pointString;
    private int rackScore;
    private int addedScore;

    private Activity activity;

    public Frame(Activity activity) {
        pocketHistory = "";
        pointString = "";
        rackScore = 0;
        addedScore = 0;

        this.activity = activity;
    }

    public void updateScore(int n) {
        rackScore += n;

        TextView rackScoreView = (TextView) activity.findViewById(R.id.rack_score0);
        rackScoreView.setText(String.valueOf(rackScore));
    }

    public int pocket(int ballNumber, String pocketType) {
        int points;

        pocketHistory += String.valueOf(ballNumber) + pocketType;
        TextView scoreView = (TextView) activity.findViewById(R.id.pocket_history0);
        scoreView.setText(String.valueOf(pocketHistory));

        switch (ballNumber) {
            case 5:
                points       = (pocketType == "S") ?  2  :  1 ;
                pointString += (pocketType == "S") ? "X" : "|";
                break;
            case 9:
                points       = (pocketType == "S") ?   4  :  2 ;
                pointString += (pocketType == "S") ? "XX" : "X";
                break;
            default:
                points = 0;
        }
        TextView pointStrView = (TextView) activity.findViewById(R.id.point_string0);
        pointStrView.setText(String.valueOf(pointString));

        return points;
    }
}
