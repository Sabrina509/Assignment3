package com.example.assignmentmc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String t, s, w;

        TextView total, score, weakest;

        total = findViewById(R.id.TVtotalQ);
        score = findViewById(R.id.TVcorrect);
        weakest = findViewById(R.id.TVwrong);

        Intent intent = getIntent();
        s = intent.getStringExtra("SCORE");
        t = intent.getStringExtra("TOTAL");
        w = intent.getStringExtra("WEAK");

        total.setText("Total Questions: " + t);
        score.setText("Correctly Answered: " + s);
        weakest.setText("Most Wrong Answers from: " + w);
    }
}