package com.example.corona;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public abstract class LoginActivites extends AppCompatActivity {
    TextView t1;
    Button b1;
    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activites);

        t1 = findViewById(R.id.textView);
        b1 = findViewById(R.id.button);

        countDownTimer = new CountDownTimer(5000,10000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Toast.makeText(LoginActivites.this,"finish",Toast.LENGTH_SHORT).show();
                t1.setText(millisUntilFinished/1000 + "saniye kaldi");
            }

            @Override
            public void onFinish() {
                t1.setText("Sureniz Doldu.");
                Toast.makeText(LoginActivites.this,"finish",Toast.LENGTH_SHORT).show();
            }
        };
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivites.this,"sure basladi",Toast.LENGTH_SHORT).show();
                countDownTimer.start();
            }
        });
        }
    }



