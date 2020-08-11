package com.example.worththeweight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.quote);
        String quotes[] = {"\"The last three or four reps is what makes the muscle grow. This area of pain divides a champion from someone who is not a champion.\""
                ,"\"Success usually comes to those who are too busy to be looking for it.\"","\"All progress takes place outside the comfort zone.\"","\"Whether you think you can, or you think you can’t, you’re right.\"","\"The successful warrior is the average man, with laser-like focus.\""};
        int rand=(int)(Math.random()*4);
        tv.setText(quotes[rand]);

        button = findViewById(R.id.getStarted);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });

    }
    public void openActivity(){
        Intent intent = new Intent(this,Home.class);
        startActivity(intent);
    }
}