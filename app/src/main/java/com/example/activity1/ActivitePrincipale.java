package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivitePrincipale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonActivity1 = findViewById(R.id.button1);
        Button buttonActivity2 = findViewById(R.id.button2);
        Button buttonActivity3 = findViewById(R.id.button3);

        buttonActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivitePrincipale.this, Activity1.class));
            }
        });

        buttonActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivitePrincipale.this, Activity2.class));
            }
        });

        buttonActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivitePrincipale.this, Activity3.class));
            }
        });
    }
}