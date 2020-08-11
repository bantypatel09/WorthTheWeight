package com.example.worththeweight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    public Button button;
    public Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        button = findViewById(R.id.exercise);
        button2 = findViewById(R.id.nutrition);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openExercise();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNutrition();
            }
        });
    }
    public void openExercise(){
        Intent intent = new Intent(this,Exercise.class);
        startActivity(intent);
    }
    public void openNutrition(){
        Intent intent = new Intent(this,Nutrition.class);
        startActivity(intent);
    }
}