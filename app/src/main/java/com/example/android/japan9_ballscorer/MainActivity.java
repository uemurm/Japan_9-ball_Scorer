package com.example.android.japan9_ballscorer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String pocketedHistory = "";
    String selectedPocket = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pocket5(View v) {
        pocketedHistory += "5" + selectedPocket;
        displayPocketedHistory();
    }

    public void pocket9(View v) {
        pocketedHistory += "9" + selectedPocket;
        displayPocketedHistory();
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

    private void displayPocketedHistory() {
        TextView scoreView = findViewById(R.id.pocketed);
        scoreView.setText(String.valueOf(pocketedHistory));
    }
}