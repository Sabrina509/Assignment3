package com.example.assignmentmc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class scoreDisplay extends AppCompatActivity {

    String score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_display);

        Button share;
        share = findViewById(R.id.button);

        TextView result;
        result = findViewById(R.id.textView);
        Intent intent1 = getIntent();
        score = intent1.getStringExtra("SCORE");
        result.setText("Your score: " + score + " /5");

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Intent.ACTION_SEND);
                intent.putExtra("Result", score);
                intent.setType("text/plain");
                startActivity(intent);
            }
        });
    }
}