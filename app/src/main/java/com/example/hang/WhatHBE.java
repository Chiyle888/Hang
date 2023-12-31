package com.example.hang;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class WhatHBE extends AppCompatActivity {

ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.whathbe);
        String[] eatery = new String[]{"1928 Beacon Hill ", "Mamma Maria","Grill 23 & Bar", "O Ya","Woods Hill Pier 4", "Bistro du Midi"};
        listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id. text1, eatery);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://groupme.com/join_group/98156529/MstjC5Gc")));
                        break;
                    case 1:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://groupme.com/join_group/98156537/bPnUEjf7")));
                        break;
                    case 2:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://groupme.com/join_group/98156627/eMWfoND0")));
                        break;
                    case 3:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://groupme.com/join_group/98156636/n5kfW3HW")));
                        break;
                    case 4:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://groupme.com/join_group/98156639/IwDkwQ7V")));
                        break;
                    case 5:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://groupme.com/join_group/98156643/R9Nuj2nm")));

                }
            }
        });
    }
}