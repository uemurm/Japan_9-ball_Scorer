package com.example.android.japan9_ballscorer;

public class Frame {
    private String pocketHistory;
    private String pointString;
    private int rackScore;
    private int addedScore;

    private FrameTextView v;

    public Frame(FrameTextView v) {
        pocketHistory = "";
        pointString = "";
        rackScore = 0;
        addedScore = 0;

        this.v = v;
    }

    /**
     * Update rack score and added score when someone pockets a point ball.
     * @param n
     */
    public void updateScore(int n) {
        rackScore += n;
        v.getRackScore().setText(String.valueOf(rackScore));

        addedScore += n;
        v.getAddedScore().setText(String.valueOf(addedScore));
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
        v.getPocketHistory().setText(String.valueOf(pocketHistory));

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
        v.getPointString().setText(String.valueOf(pointString));

        return points;
    }
}
