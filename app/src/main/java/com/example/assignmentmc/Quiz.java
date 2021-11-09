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

class QuestionModel{
    private String question,option1,option2,option3,option4;
    private int correctAnsNo;

    public QuestionModel(String question, String option1, String option2, String option3, String option4, int correctAnsNo) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctAnsNo = correctAnsNo;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public int getCorrectAnsNo() {
        return correctAnsNo;
    }

    public void setCorrectAnsNo(int correctAnsNo) {
        this.correctAnsNo = correctAnsNo;
    }
}

public class Quiz<questionsList> extends AppCompatActivity {
    TextView tvQuestion;
    TextView tvScore;
    TextView tvQuestionNo;
    RadioGroup radioGroup;
    RadioButton rb1,rb2,rb3,rb4;
    Button btnNext;

    int totalQuestions;
    int qCounter=0;
    int score;

    ColorStateList dfRbColor;
    boolean answered;

    QuestionModel currentQuestion;
    List<QuestionModel> questionsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        questionsList = new ArrayList<>();
        tvQuestion= findViewById(R.id.textQuestion);
        tvScore= findViewById(R.id.textScore);
        tvQuestionNo= findViewById(R.id.textQuestionNo);

        radioGroup= findViewById(R.id.radioGroup);
        rb1= findViewById(R.id.rb1);
        rb2= findViewById(R.id.rb2);
        rb3= findViewById(R.id.rb3);
        rb4= findViewById(R.id.rb4);
        btnNext= findViewById(R.id.btnNext);

        dfRbColor = rb1.getTextColors();

        addQuestions();
        totalQuestions = questionsList.size();
        showNextQuestion();

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answered == false){
                    if(rb1.isChecked() || rb2.isChecked() || rb3.isChecked()  || rb4.isChecked()){
                        checkAnswer();
                    }else{
                        Toast.makeText(Quiz.this, "Please Select an option", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    showNextQuestion();
                }
            }
        });
    }

    private void checkAnswer() {
        answered = true;
        RadioButton rbSelected = findViewById(radioGroup.getCheckedRadioButtonId());
        int answerNo = radioGroup.indexOfChild(rbSelected) +1;
        if(answerNo == currentQuestion.getCorrectAnsNo()){
            score++;
            tvScore.setText("Score: " + score);
        }
        rb1.setTextColor(Color.RED);
        rb2.setTextColor(Color.RED);
        rb3.setTextColor(Color.RED);
        rb4.setTextColor(Color.RED);

        switch (currentQuestion.getCorrectAnsNo()){
            case 1:
                rb1.setTextColor(Color.GREEN);
                break;
            case 2:
                rb2.setTextColor(Color.GREEN);
                break;
            case 3:
                rb3.setTextColor(Color.GREEN);
                break;
            case 4:
                rb4.setTextColor(Color.GREEN);
                break;
        }
        if (qCounter < totalQuestions){
            btnNext.setText("Next");
        }else{
            btnNext.setText("Finish");
        }
    }

    private void showNextQuestion() {

        radioGroup.clearCheck();
        rb1.setTextColor(dfRbColor);
        rb2.setTextColor(dfRbColor);
        rb3.setTextColor(dfRbColor);
        rb4.setTextColor(dfRbColor);

        if(qCounter < totalQuestions){
            currentQuestion = questionsList.get(qCounter);
            tvQuestion.setText(currentQuestion.getQuestion());
            rb1.setText(currentQuestion.getOption1());
            rb2.setText(currentQuestion.getOption2());
            rb3.setText(currentQuestion.getOption3());
            rb4.setText(currentQuestion.getOption4());

            qCounter++;

            btnNext.setText("Submit");
            tvQuestionNo.setText("Question: " + qCounter + "/" + totalQuestions);
            answered=false;
        }else{
            finish();
        }
    }

    private void addQuestions() {
        questionsList.add(new QuestionModel("A is correct?","A","B","C","D",1));
        questionsList.add(new QuestionModel("B is correct?","A","B","C","D",2));
        questionsList.add(new QuestionModel("C is correct?","A","B","C","D",3));
        questionsList.add(new QuestionModel("D is correct?","A","B","C","D",4));
    }
}