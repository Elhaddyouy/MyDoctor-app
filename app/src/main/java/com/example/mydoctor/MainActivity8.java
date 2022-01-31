package com.example.mydoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity8 extends AppCompatActivity {
   ImageView prf;
   ImageView backrr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
       prf= (ImageView) findViewById(R.id.imageView19);
        prf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // redirect to RegisterActivity
                Intent intent = new Intent(getApplicationContext(),MainActivity6.class);
                startActivity(intent);
            }
        });
        backrr=(ImageView)findViewById(R.id.imageView17);
        backrr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),MainSpecialite.class);
                startActivity(intent);
            }
        });
    }
}