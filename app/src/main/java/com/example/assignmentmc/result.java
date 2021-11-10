package com.example.assignmentmc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        Button quizOpen;
        quizOpen = findViewById(R.id.quizBtn);
        quizOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(result.this, Quiz.class);
                startActivity(intent1);
            }
        });
    }
}