package com.example.assignmentmc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button repositaryButton;
        Button activityButton;

        repositaryButton = (Button) findViewById(R.id.repositarybtn);
        activityButton = (Button) findViewById(R.id.assignmentbtn);

        repositaryButton.setOnClickListener((View.OnClickListener) this);
        activityButton.setOnClickListener((View.OnClickListener) this);

        final TextView Rollnotext;
        final TextView Nametext;

        Rollnotext = findViewById(R.id.rollnotext);
        Nametext = findViewById(R.id.nametext);

        Rollnotext.setText("BCSF18A509");
        Nametext.setText("Sabrina Asim");

        Rollnotext.setTextColor(Color.BLACK);
        Nametext.setTextColor(Color.BLACK);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.repositarybtn:
                Uri webpage = Uri.parse("https://github.com/Sabrina509/Assignment3");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
            case R.id.assignmentbtn:
        }


    }
}