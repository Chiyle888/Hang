package com.example.hang;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Toast;

public class WhereHM extends AppCompatActivity {
    MediaPlayer mpMiami;
    int playing;

    Button musicButton;
    private RadioGroup r2Group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wherehm);
        musicButton = findViewById(R.id.btLLis);
        musicButton.setOnClickListener(Miami);
        mpMiami =MediaPlayer.create(this,R.raw.miamiw);
        playing =0;

        r2Group = findViewById(R.id.plans);
        r2Group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton =findViewById(checkedId);
                Toast.makeText(WhereHM.this,"Selected Radio Button is : " + radioButton.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        final RadioButton op1 = (RadioButton) findViewById(R.id.btExcercise2);
        final RadioButton op2 = (RadioButton) findViewById(R.id.btEat2);
        Button WYD = (Button) findViewById(R.id.btLets);
        WYD.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (op1.isChecked()) {
                    startActivity(new Intent(WhereHM.this, WhatHMEX.class));
                } else if (op2.isChecked()) {
                    startActivity(new Intent(WhereHM.this, WhatHME.class));
                }

            }

        });

                }

    Button.OnClickListener Miami = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (playing) {
                case 0:
                    mpMiami.start();
                    playing = 1;
                    musicButton.setText("Pause Miami Song");
                    break;
                case 1:
                    mpMiami.pause();
                    playing = 0;
                    musicButton.setText("Play Miami Song");

                    break;
            }
        };
    };
}