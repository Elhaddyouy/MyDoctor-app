package com.example.mydoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainMenudocteur extends AppCompatActivity {
    Button profil;
    Button notif;

    Button decon;
    Button mespat;
    Button mesrv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menudocteur);
       decon = (Button) findViewById(R.id.button10);
        profil = (Button) findViewById(R.id.button6);
        notif = (Button) findViewById(R.id.button8);


        mespat = (Button) findViewById(R.id.button7);
        mesrv= (Button) findViewById(R.id.button9);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity9.class);
                startActivity(intent);
            }
        });


        mespat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),MainActivity12.class);
                startActivity(intent);
            }
        });

        decon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });

        notif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),MainActivity15.class);
                startActivity(intent);
            }
        });

        mesrv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),MainActivity16.class);
                startActivity(intent);
            }
        });




    }
}