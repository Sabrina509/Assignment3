package com.example.assignmentmc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Quiz extends AppCompatActivity {
    int totalQuestions = 5;
    int qCounter=0;
    int score;

    private TextView tvQuestion,tvScore,tvQuestionNo, tvResult;
    private Button rb1,rb2,rb3,rb4,rb5,rb6,rb7;
    private Button btnNext, btnEnd;

    char[] halqia = {'\u0627','\u0629', '\u0639', '\u062D', '\u063A', '\u062E'};
    char[] lahatia = {'\u0642', '\u0643'};
    char[] shajariyah = {'\u062C', '\u0634', '\u0639', '\u0636'};
    char[] tarfiyah = {'\u0644', '\u0631'};
    char[] niteeyah = {'\u062A', '\u062F'};
    char[] lisaveyah = {'\u0638', '\u0630', '\u062B', '\u0635', '\u0633', '\u0632'};
    char[] ghunna = {'\u0645', '\u0646', '\u0641', '\u0628', '\u0648'};

    public String realAnswer = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        tvQuestion = findViewById(R.id.textQuestion);
        tvScore = findViewById(R.id.textScore);
        tvQuestionNo = findViewById(R.id.textQuestionNo);
        tvResult = findViewById(R.id.resultTextView);

        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
        rb5 = findViewById(R.id.rb5);
        rb6 = findViewById(R.id.rb6);
        rb7 = findViewById(R.id.rb7);
        btnNext = findViewById(R.id.btnNext);
        btnEnd = findViewById(R.id.finishbtn);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(qCounter==5)
                    {
                        Intent intent = new Intent(Quiz.this, scoreDisplay.class);
                        intent.putExtra("SCORE", String.valueOf(score));
                        startActivity(intent);
                    }
                    Random random = new Random();
                    int letterToDsiplay = random.nextInt(6);
                    if (letterToDsiplay == 0) {
                        realAnswer = "halqia";
                        int i = halqia.length;
                        tvQuestion.setText(String.valueOf(halqia[random.nextInt(i)]));
                    } else if (letterToDsiplay == 1) {
                        realAnswer = "lahatiyah";
                        int i = lahatia.length;
                        tvQuestion.setText(String.valueOf(lahatia[random.nextInt(i)]));
                    } else if (letterToDsiplay == 2) {
                        realAnswer = "sharjariyah-haafiyah";
                        int i = shajariyah.length;
                        tvQuestion.setText(String.valueOf(shajariyah[random.nextInt(i)]));
                    } else if (letterToDsiplay == 3) {
                        realAnswer = "tarfiyah";
                        int i = tarfiyah.length;
                        tvQuestion.setText(String.valueOf(tarfiyah[random.nextInt(i)]));
                    } else if (letterToDsiplay == 4) {
                        realAnswer = "niteeyah";
                        int i = niteeyah.length;
                        tvQuestion.setText(String.valueOf(niteeyah[random.nextInt(i)]));
                    } else if (letterToDsiplay == 5) {
                        realAnswer = "lisaveyah";
                        int i = lisaveyah.length;
                        tvQuestion.setText(String.valueOf(lisaveyah[random.nextInt(i)]));
                    } else {
                        realAnswer = "ghunna";
                        int i = ghunna.length;
                        tvQuestion.setText(String.valueOf(ghunna[random.nextInt(i)]));
                    }
                    qCounter++;
                    tvQuestionNo.setText("Question #: " + String.valueOf(qCounter) + " /5");
            }
        });

        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String studentAnswer;
                studentAnswer = "halqia";
                if (studentAnswer.equals(realAnswer)) {
                    tvResult.setText("True");
                    score++;
                    tvScore.setText("Score: " + String.valueOf(score) + " /5");
                } else {
                    tvResult.setText("False");
                }
            }
        });
        rb2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                String studentAnswer;
                studentAnswer = "lahatiyah";
                if (studentAnswer.equals(realAnswer)) {
                    tvResult.setText("True");
                    score++;
                    tvScore.setText("Score: " + String.valueOf(score) + " /5");
                } else {
                    tvResult.setText("False");
                }
            }
        });
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String studentAnswer;
                studentAnswer = "sharjariyah-haafiyah";
                if (studentAnswer.equals(realAnswer)) {
                    tvResult.setText("True");
                    score++;
                    tvScore.setText("Score: " + String.valueOf(score) + " /5");
                } else {
                    tvResult.setText("False");
                }
            }
        });
        rb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String studentAnswer;
                studentAnswer = "tarfiyah";
                if (studentAnswer.equals(realAnswer)) {
                    tvResult.setText("True");
                    score++;
                    tvScore.setText("Score: " + String.valueOf(score) + " /5");
                } else {
                    tvResult.setText("False");
                }
            }
        });
        rb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String studentAnswer;
                studentAnswer = "niteeyah";
                if (studentAnswer.equals(realAnswer)) {
                    tvResult.setText("True");
                    score++;
                    tvScore.setText("Score: " + String.valueOf(score) + " /5");
                } else {
                    tvResult.setText("False");
                }
            }
        });
        rb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String studentAnswer;
                studentAnswer = "lisaveyah";
                if (studentAnswer.equals(realAnswer)) {
                    tvResult.setText("True");
                    score++;
                    tvScore.setText("Score: " + String.valueOf(score) + " /5");
                } else {
                    tvResult.setText("False");
                }
            }
        });
        rb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String studentAnswer;
                studentAnswer = "ghunna";
                if (studentAnswer.equals(realAnswer)) {
                    tvResult.setText("True");
                    score++;
                    tvScore.setText("Score: " + String.valueOf(score) + " /5");
                } else {
                    tvResult.setText("False");
                }
            }
        });

        btnEnd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz.this, scoreDisplay.class);
                intent.putExtra("SCORE", String.valueOf(score));
                startActivity(intent);
            }
        }
        );
    }

}
