package com.example.assignmentmc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class assignment3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment3);

        Button practice, quiz;
        practice= findViewById(R.id.practice);
        quiz = findViewById(R.id.quiz);

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(assignment3.this, Practice.class);
                startActivity(intent);
            }
        });

        practice.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(assignment3.this, Quiz.class);
                startActivity(intent);
            }
        });
    }
}