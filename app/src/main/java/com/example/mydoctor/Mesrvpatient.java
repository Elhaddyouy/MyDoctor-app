package com.example.mydoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Mesrvpatient extends AppCompatActivity {
ImageView rsrvv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesrvpatient);

        rsrvv=(ImageView)findViewById(R.id.imageView);
        rsrvv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),MainActivity5.class);
                startActivity(intent);
            }
        });
    }
}