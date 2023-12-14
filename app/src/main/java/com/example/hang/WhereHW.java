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

public class WhereHW extends AppCompatActivity {
    MediaPlayer mpDc;
    int playing;

    Button musicButton;

    private RadioGroup r2Group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wherehw);
        r2Group = findViewById(R.id.plans);
        musicButton = findViewById(R.id.btLLis);
        musicButton.setOnClickListener(Miami);
        mpDc =MediaPlayer.create(this,R.raw.dcw);
        playing =0;

        r2Group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton =findViewById(checkedId);
                Toast.makeText(WhereHW.this,"Selected Radio Button is : " + radioButton.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        final RadioButton op1 = (RadioButton) findViewById(R.id.btExcercise3);
        final RadioButton op2 = (RadioButton) findViewById(R.id.btEat3);
        Button WYD = (Button) findViewById(R.id.btLets);
        WYD.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (op1.isChecked()) {
                    startActivity(new Intent(WhereHW.this, WhatHWEX.class));
                } else if (op2.isChecked()) {
                    startActivity(new Intent(WhereHW.this, WhatHWE.class));
                }

            }

        });
    }

    Button.OnClickListener Miami = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (playing) {
                case 0:
                    mpDc.start();
                    playing = 1;
                    musicButton.setText("Pause DC Song");
                    break;
                case 1:
                    mpDc.pause();
                    playing = 0;
                    musicButton.setText("Play DC Song");

                    break;
            }
        };
    };
}