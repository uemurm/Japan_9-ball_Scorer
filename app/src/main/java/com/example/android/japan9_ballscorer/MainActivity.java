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

        board = new Board(this);
    }

    public void pocket5(View v) {
        board.pocket(5, pocketType);
    }

    public void pocket9(View v) {
        board.pocket(9, pocketType);
    }

    public void setCurrentPlayer(View view) {
        int player = 0;
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.player0:
                if (checked)
                    player = 0;
                break;
            case R.id.player1:
                if (checked)
                    player = 1;
                break;
            case R.id.player2:
                if (checked)
                    player = 2;
                break;
        }

        board.setCurrentPlayer(player);
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