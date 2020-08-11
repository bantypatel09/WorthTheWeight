package com.example.worththeweight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Exercise extends AppCompatActivity {
    public Button button;
    public Button button2;
    public Button button3;
    public Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        button = findViewById(R.id.cardio_button);
        button2 = findViewById(R.id.strength_button);
        button3 = findViewById(R.id.balance_button);
        button4 = findViewById(R.id.flexability_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCardio();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openStrength();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBalance();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFlexability();
            }
        });

    }
    public void openCardio(){
        Intent intent = new Intent(this,Cardio.class);
        startActivity(intent);
    }
    public void openStrength(){
        Intent intent = new Intent(this,StrengthTraining.class);
        startActivity(intent);
    }
    public void openBalance(){
        Intent intent = new Intent(this,Balance.class);
        startActivity(intent);
    }
    public void openFlexability(){
        Intent intent = new Intent(this,Flexability.class);
        startActivity(intent);
    }
}