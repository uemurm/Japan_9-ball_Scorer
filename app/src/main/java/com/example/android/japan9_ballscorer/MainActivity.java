package com.example.android.japan9_ballscorer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String pocketing = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pocket5(View v) {
        pocketing += "5";
        displayPocketing();
    }

    private void displayPocketing() {
        TextView scoreView = findViewById(R.id.pocketing);
        scoreView.setText(String.valueOf(pocketing));
    }
}