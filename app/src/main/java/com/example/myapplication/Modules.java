package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Modules extends AppCompatActivity {
    CardView aseModule, calender, email, logOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modules);


       aseModule = findViewById(R.id.ASE);
        aseModule.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                Intent intent = new Intent(Modules.this, aseModule.class);
                startActivity(intent);
            }
      });


    }
}