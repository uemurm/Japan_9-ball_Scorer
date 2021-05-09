package com.example.android.japan9_ballscorer;

import android.widget.TextView;

import java.util.List;

public class Frame {
    private String pocketHistory;
    private String pointString;
    private int rackScore;
    private int addedScore;

    private int playerNumber;

    private List<TextView> pocketHistoryViews;
    private List<TextView> pointStringViews;
    private List<TextView> rackScoreViews;
    private List<TextView> addedScoreViews;

    public Frame(int playerNumber, FrameTextView frameTextView) {
        pocketHistory = "";
        pointString = "";
        rackScore = 0;
        addedScore = 0;

        this.playerNumber = playerNumber;
        this.pocketHistoryViews = frameTextView.getPocketHistoryViews();
        this.pointStringViews = frameTextView.getPointStringViews();
        this.rackScoreViews = frameTextView.getRackScoreViews();
        this.addedScoreViews = frameTextView.getAddedScoreViews();
    }

    public void updateScore(int n) {
        rackScore += n;
        TextView rackScoreView = rackScoreViews.get(playerNumber);
        rackScoreView.setText(String.valueOf(rackScore));

        addedScore += n;
        TextView addedScoreView = addedScoreViews.get(playerNumber);
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
        pocketHistoryViews.get(playerNumber)
                          .setText(String.valueOf(pocketHistory));

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
        pointStringViews.get(playerNumber).setText(String.valueOf(pointString));

        return points;
    }
}
