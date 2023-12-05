package com.example.hang;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Toast;

public class WhereHB extends AppCompatActivity {

    MediaPlayer mpBoston;
    int playing;
    Button musicButton;

    private RadioGroup rGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wherehb);
        musicButton = findViewById(R.id.btLList);
        musicButton.setOnClickListener(Boston);
        mpBoston = MediaPlayer.create(this, R.raw.bostonw);
        playing = 0;

        rGroup = findViewById(R.id.plans);
        rGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);
                Toast.makeText(WhereHB.this, "Selected Radio Button is : " + radioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        final RadioButton op1 = (RadioButton) findViewById(R.id.btExcercise1);
        final RadioButton op2 = (RadioButton) findViewById(R.id.btEat2);
        Button WYD = (Button) findViewById(R.id.btLets);
        WYD.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (op1.isChecked()) {
                    startActivity(new Intent(WhereHB.this, WhatHBEX.class));
                } else if (op2.isChecked()) {
                    startActivity(new Intent(WhereHB.this, WhatHBE.class));
                }

            }

        });
    }

    Button.OnClickListener Boston = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (playing) {
                case 0:
                    mpBoston.start();
                    playing = 1;
                    musicButton.setText("Pause Boston Song");
                    break;
                case 1:
                    mpBoston.pause();
                    playing = 0;
                    musicButton.setText("Play Boston Song");

                    break;
            }
        }
    };
}