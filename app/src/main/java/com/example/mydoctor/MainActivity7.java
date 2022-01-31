package com.example.mydoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity7 extends AppCompatActivity {
   Button mod2;
   ImageView back2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        mod2= (Button) findViewById(R.id.button4);
        mod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // redirect to RegisterActivity
                Intent intent = new Intent(getApplicationContext(),MainActivity10.class);
                startActivity(intent);
            }
        });
        back2= (ImageView) findViewById(R.id.imageView49);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // redirect to RegisterActivity
                Intent intent = new Intent(getApplicationContext(),MainActivity5.class);
                startActivity(intent);
            }
        });
    }
}