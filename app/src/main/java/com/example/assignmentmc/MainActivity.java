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
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.repositarybtn:
                Uri webpage = Uri.parse("https://github.com/Sabrina509/Assignment3");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
            case R.id.assignmentbtn:
                Intent intent1 = new Intent(MainActivity.this,assignment3.class);
                startActivity(intent1);
        }


    }
}