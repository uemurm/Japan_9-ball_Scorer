package com.example.android.japan9_ballscorer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Board board;

    String pocketedHistory = "";
    String pointString = "";
    int points = 0;
    String pocketType = "S";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Players players = new Players(this);
        players.add(new Player("山梨"));
        players.add(new Player("植村"));
        players.add(new Player("鈴木"));

        board = new Board(players, this);
    }

    public void nextPlayer(View v) {
        board.nextPlayer();
    };

    public void pocket(View v) {
        switch (v.getId()) {
            case R.id.ball5:
                board.pocket(5, pocketType);
                break;
            case R.id.ball9:
                board.pocket(9, pocketType);
                break;
        }
    }

    public void updatePocket(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.side:
                if (checked)
                    pocketType = "S";
                break;
            case R.id.corner:
                if (checked)
                    pocketType = "C";
                break;
        }
    }
}