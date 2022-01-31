package com.example.mydoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity13 extends AppCompatActivity {
TextView conct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);


      conct= (TextView) findViewById(R.id.textView10);
        conct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondActivity =new Intent(getApplicationContext(),MainActivity2.class );
                startActivity(secondActivity);
                finish();
            }

        });
    }
}