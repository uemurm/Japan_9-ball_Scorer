package com.example.android.japan9_ballscorer;

import android.app.Activity;
import android.widget.TextView;

public class Frame {
    private String pocketHistory;
    private String pointString;
    private int rackScore;
    private int addedScore;

    private int playerNumber;

    private Activity activity;
    private TextView[] rackScoreViews;
    private TextView[] addedScoreViews;

    public Frame(int playerNumber, Activity activity,
                 TextView[] rackScoreViews,
                 TextView[] addedScoreViews
    ) {
        pocketHistory = "";
        pointString = "";
        rackScore = 0;
        addedScore = 0;

        this.playerNumber = playerNumber;
        this.activity = activity;
        this.rackScoreViews = rackScoreViews;
        this.addedScoreViews = addedScoreViews;
    }

    public void updateScore(int n) {
        rackScore += n;
        TextView rackScoreView = rackScoreViews[playerNumber];
        rackScoreView.setText(String.valueOf(rackScore));

        addedScore += n;
        TextView addedScoreView = addedScoreViews[playerNumber];
        addedScoreView.setText(String.valueOf(addedScore));
    }

    /**
     * Invoked when a player pockets a ball.
     * @param ballNumber
     * @param pocketType
     * @return points that the player should get from other players respectively.
     */
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
