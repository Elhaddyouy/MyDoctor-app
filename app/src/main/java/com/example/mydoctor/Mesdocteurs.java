package com.example.mydoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Mesdocteurs extends AppCompatActivity {
ImageView docback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesdocteurs);
        docback=(ImageView)findViewById(R.id.imageView);
        docback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),MainActivity5.class);
                startActivity(intent);
            }
        });
    }
}