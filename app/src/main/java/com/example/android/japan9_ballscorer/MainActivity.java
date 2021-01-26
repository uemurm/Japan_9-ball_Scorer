package com.example.android.japan9_ballscorer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String pocketedHistory = "";
    String pointString = "";
    int points = 0;
    String selectedPocket = "S";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pocket5(View v) {
        pocketedHistory += "5" + selectedPocket;
        if (selectedPocket == "S") {
            pointString += "X";
            points += 2;
        } else {
            pointString += "|";
            points += 1;
        }
        displayFrame();
    }

    public void pocket9(View v) {
        pocketedHistory += "9" + selectedPocket;
        if (selectedPocket == "S") {
            pointString += "XX";
            points += 4;
        } else {
            pointString += "X";
            points += 2;
        }
        displayFrame();
    }

    public void updatePocket(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.side:
                if (checked)
                    selectedPocket = "S";
                break;
            case R.id.corner:
                if (checked)
                    selectedPocket = "C";
                break;
        }
    }

    private void displayFrame() {
        displayPocketedHistory();
        displayPointString();
        displayRackScore();
    }

    private void displayPocketedHistory() {
        TextView scoreView = findViewById(R.id.pocketed0);
        scoreView.setText(String.valueOf(pocketedHistory));
    }

    private void displayPointString() {
        TextView scoreView = findViewById(R.id.point_string0);
        scoreView.setText(String.valueOf(pointString));
    }

    private void displayRackScore() {
        TextView scoreView = findViewById(R.id.rack_score0);
        scoreView.setText(String.valueOf(points));
    }
}