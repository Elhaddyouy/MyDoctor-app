package com.example.mydoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {
ImageView backr;
TextView chat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        backr=(ImageView)findViewById(R.id.imageView15);
        backr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),MainActivity8.class);
                startActivity(intent);
            }
        });
        chat=(TextView)findViewById(R.id.textView60);
        chat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),MainChat.class);
                startActivity(intent);
            }
        });

    }
}