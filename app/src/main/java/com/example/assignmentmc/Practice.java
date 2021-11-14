package com.example.assignmentmc;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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


public class Practice extends AppCompatActivity {
    int qCounter=0;
    int score;
    int weakH, weakLa, weakS, weakT, weakN, weakLi, weakG;


    private TextView tvQuestion,tvScore,tvQuestionNo, tvResult;
    private Button rb1,rb2,rb3,rb4,rb5,rb6,rb7;
    private Button btnNext, btnFinish;

    char[] halqia = {'\u0627','\u0629', '\u0639', '\u062D', '\u063A', '\u062E'};
    char[] lahatia = {'\u0642', '\u0643'};
    char[] shajariyah = {'\u062C', '\u0634', '\u0639', '\u0636'};
    char[] tarfiyah = {'\u0644', '\u0631'};
    char[] niteeyah = {'\u062A', '\u062F'};
    char[] lisaveyah = {'\u0638', '\u0630', '\u062B', '\u0635', '\u0633', '\u0632'};
    char[] ghunna = {'\u0645', '\u0646', '\u0641', '\u0628', '\u0648'};

    public String realAnswer = "";
    public void calculateWeak(String rAns)
    {
        if(rAns=="halqia")
            weakH++;
        if(rAns=="lahatiya")
            weakLa++;
        if(rAns=="sharjariyah-haafiyah")
            weakS++;
        if(rAns=="tarfiyah")
            weakT++;
        if(rAns=="niteeyah")
            weakN++;
        if(rAns=="lisaveyah")
            weakLi++;
        if(rAns=="ghunna")
            weakG++;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        tvQuestion = findViewById(R.id.textQuestion);
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
        btnFinish = findViewById(R.id.finishbtn);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(" ");
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
                tvQuestionNo.setText("Question #: " + String.valueOf(qCounter));
            }
        });


        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String studentAnswer;
                studentAnswer = "halqia";
                if (studentAnswer.equals(realAnswer)) {
                    tvResult.setText("True");
                    tvResult.setTextColor(Color.GREEN);
                    score++;
                } else {
                    tvResult.setText("False");
                    tvResult.setTextColor(Color.RED);
                    calculateWeak(realAnswer);
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
                    tvResult.setTextColor(Color.GREEN);
                    score++;
                } else {
                    tvResult.setText("False");
                    tvResult.setTextColor(Color.RED);
                    calculateWeak(realAnswer);
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
                    tvResult.setTextColor(Color.GREEN);
                    score++;
                } else {
                    tvResult.setText("False");
                    tvResult.setTextColor(Color.RED);
                    calculateWeak(realAnswer);
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
                    tvResult.setTextColor(Color.GREEN);
                    score++;
                } else {
                    tvResult.setText("False");
                    tvResult.setTextColor(Color.RED);
                    calculateWeak(realAnswer);
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
                    tvResult.setTextColor(Color.GREEN);
                    score++;
                } else {
                    tvResult.setText("False");
                    tvResult.setTextColor(Color.RED);
                    calculateWeak(realAnswer);
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
                    tvResult.setTextColor(Color.GREEN);
                    score++;
                } else {
                    tvResult.setText("False");
                    tvResult.setTextColor(Color.RED);
                    calculateWeak(realAnswer);
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
                    tvResult.setTextColor(Color.GREEN);
                    score++;
                } else {
                    tvResult.setText("False");
                    tvResult.setTextColor(Color.RED);
                    calculateWeak(realAnswer);
                }
            }
        });

        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String weakest;
                if(weakG>weakH && weakG>weakLa && weakG>weakLi && weakG>weakN && weakG>weakS && weakG>weakT && weakG!=0)
                {
                    weakest = "Ghunna";
                }
                else if (weakH>weakG && weakH>weakLa && weakH>weakLi && weakH>weakN && weakH>weakS && weakH>weakT && weakH!=0)
                {
                    weakest = "Halqia";
                }
                else if (weakLa>weakG && weakLa>weakH && weakLa>weakLi && weakLa>weakN && weakLa>weakS && weakLa>weakT && weakLa!=0)
                {
                    weakest = "Lahatiyah";
                }
                else if (weakLi>weakG && weakLi>weakLa && weakLi>weakH && weakLi>weakN && weakLi>weakS && weakLi>weakT && weakLi!=0)
                {
                    weakest = "Lisaveyah";
                }
                else if (weakN>weakG && weakN>weakLa && weakN>weakLi && weakN>weakH && weakN>weakS && weakN>weakT && weakN!=0)
                {
                    weakest = "Niteeyah";
                }
                else if (weakS>weakG && weakS>weakLa && weakS>weakLi && weakS>weakN && weakS>weakH && weakS>weakT && weakS!=0)
                {
                    weakest = "Shajariyah-Haafiyah";
                }
                else if (weakT>weakG && weakT>weakLa && weakT>weakLi && weakT>weakN && weakT>weakH && weakT>weakS && weakT!=0)
                {
                    weakest = "Tarfiyah";
                }
                else
                    weakest="none";

                AlertDialog.Builder builder = new AlertDialog.Builder(Practice.this);
                builder.setTitle("Finish");
                builder.setMessage("Are you sure that you want to finish?");builder.setTitle("Title");
                builder.setCancelable(false);
                builder.setPositiveButton("Yes",new DialogInterface.OnClickListener()
                {@Override
                public void onClick(DialogInterface dialog, int asdf){
                    Intent intent = new Intent(Practice.this, result.class);
                    intent.putExtra("SCORE", String.valueOf(score));
                    intent.putExtra("WEAK", weakest);
                    intent.putExtra("TOTAL", String.valueOf(qCounter));
                    startActivity(intent);
                    }});
                builder.setNegativeButton("No",new DialogInterface.OnClickListener()
                {@Override
                public void onClick(DialogInterface dialog, int which){dialog.cancel();}});
                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });
    }

}
