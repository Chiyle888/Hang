package com.example.hang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String selected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Spinner destination = (Spinner) findViewById(R.id.destination);
        Button place = (Button)findViewById(R.id.button);
        place.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                selected = destination.getSelectedItem().toString();
                if(selected.equals("Boston")){
                    startActivity(new Intent(MainActivity.this, WhereHB.class));
                } else if (selected.equals("Miami")) {
                    startActivity(new Intent(MainActivity.this, WhereHM.class));
                } else if (selected.equals("Washington DC")) {
                    startActivity(new Intent(MainActivity.this, WhereHW.class));

                }


            }

             });
    }
}