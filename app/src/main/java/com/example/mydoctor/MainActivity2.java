package com.example.mydoctor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    Button butt;
    Button butt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.butt =(Button) findViewById(R.id.button2);
        butt2 = (Button) findViewById(R.id.button3);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondActivity =new Intent(getApplicationContext(), MainActivity3.class );
                startActivity(secondActivity);
                finish();
            }

        });


        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondActivity =new Intent(getApplicationContext(), MainActivity4.class );
                startActivity(secondActivity);
                finish();
            }

        });
    }

}