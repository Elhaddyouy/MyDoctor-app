package com.example.mydoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity17 extends AppCompatActivity {
ImageView backrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);
        backrow=(ImageView) findViewById(R.id.imageView52);
        backrow.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
           Intent intent=new Intent(getApplicationContext(),MainMenudocteur.class);
               startActivity(intent);
           }
        });

    }
}