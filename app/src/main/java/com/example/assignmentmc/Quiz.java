package com.example.assignmentmc;

import androidx.appcompat.app.AppCompatActivity;

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
    int rand,a,b;
    Character c='\u0627';
    Character c1='\u0649';
    Character letter;

    int totalQuestions = 10;
    int qCounter=0;
    int score;
    boolean answered;
    String realAnswer;
    String studentAnswer;

    private TextView tvQuestion,tvScore,tvQuestionNo;
    private RadioGroup radioGroup;
    private RadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7;
    private Button btnNext;

    char[] halqia = {'\u0627','\u0629', '\u0639', '\u062D', '\u063A', '\u062E'};
    char[] lahatia = {'\u0642', '\u0643'};
    char[] shajariyah = {'\u062C', '\u0634', '\u0639', '\u0636'};
    char[] tarfiyah = {'\u0644', '\u0631'};
    char[] niteeyah = {'\u062A', '\u062F'};
    char[] lisaveyah = {'\u0638', '\u0630', '\u062B', '\u0635', '\u0633', '\u0632'};
    char[] ghunna = {'\u0645', '\u0646', '\u0641', '\u0628', '\u0648'};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        tvQuestion = findViewById(R.id.textQuestion);
        tvScore = findViewById(R.id.textScore);
        tvQuestionNo = findViewById(R.id.textQuestionNo);

        radioGroup = findViewById(R.id.radioGroup);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
        btnNext = findViewById(R.id.btnNext);


        String realAnswer = "", studentAnswer = "";
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answered == false) {
                    if (rb1.isChecked() || rb2.isChecked() || rb3.isChecked() || rb4.isChecked()) {
                        checkAnswer();
                    } else {
                        Toast.makeText(Quiz.this, "Please Select an option", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    GetLetter(v);
                }
            }
        });

    }

    public void GetLetter(View view) {
        Random random = new Random();
        int letterToDsiplay = random.nextInt(7);
        if (letterToDsiplay == 0) {
            realAnswer = "halqia";
            int i = halqia.length;
            tvQuestion.setText(halqia[random.nextInt(i)]);
        } else if (letterToDsiplay == 1) {
            realAnswer = "lahatiyah";
            int i = lahatia.length;
            tvQuestion.setText(lahatia[random.nextInt(i)]);
        } else if(letterToDsiplay == 2){
            realAnswer = "sharjariyah-haafiyah";
            int i = shajariyah.length;
            tvQuestion.setText(shajariyah[random.nextInt(i)]);
        }
        else if(letterToDsiplay == 3) {
            realAnswer = "tarfiyah";
            int i = tarfiyah.length;
            tvQuestion.setText(tarfiyah[random.nextInt(i)]);
        }
        else if(letterToDsiplay == 4){
        realAnswer = "niteeyah";
        int i = niteeyah.length;
        tvQuestion.setText(niteeyah[random.nextInt(i)]);
        }
        else if(letterToDsiplay == 5){
        realAnswer = "lisaveyah";
        int i = lisaveyah.length;
        tvQuestion.setText(lisaveyah[random.nextInt(i)]);
        }
        else{
            realAnswer = "ghunna";
            int i = ghunna.length;
            tvQuestion.setText(ghunna[random.nextInt(i)]);
        }
    }

    public  void checkAnswer(){
        if(rb1.isChecked()) {
            studentAnswer = "halqia";
            if (studentAnswer == realAnswer) {
                rb1.setTextColor(Color.GREEN);
            } else {
                rb1.setTextColor(Color.RED);
            }
        }
        else if(rb2.isChecked()) {
            studentAnswer = "lahatiyah";
            if (studentAnswer == realAnswer) {
                rb2.setTextColor(Color.GREEN);
            } else {
                rb2.setTextColor(Color.RED);
            }
        }
        else if(rb3.isChecked()) {
            studentAnswer = "sharjariyah-haafiyah";
            if (studentAnswer == realAnswer) {
                rb3.setTextColor(Color.GREEN);
            } else {
                rb3.setTextColor(Color.RED);
            }
        }
        else if(rb4.isChecked()) {
            studentAnswer = "tarfiyah";
            if (studentAnswer == realAnswer) {
                rb4.setTextColor(Color.GREEN);
            } else {
                rb4.setTextColor(Color.RED);
            }
        }
        else if(rb5.isChecked()) {
            studentAnswer = "niteeyah";
            if (studentAnswer == realAnswer) {
                rb5.setTextColor(Color.GREEN);
            } else {
                rb5.setTextColor(Color.RED);
            }
        }
        else if(rb6.isChecked()) {
            studentAnswer = "lisaveyah";
            if (studentAnswer == realAnswer) {
                rb6.setTextColor(Color.GREEN);
            } else {
                rb6.setTextColor(Color.RED);
            }
        }
        else{
            studentAnswer = "ghunna";
            if (studentAnswer == realAnswer) {
                rb7.setTextColor(Color.GREEN);
            } else {
                rb7.setTextColor(Color.RED);
            }
        }
    }
}