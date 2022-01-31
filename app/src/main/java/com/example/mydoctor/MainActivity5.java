package com.example.mydoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    TextView spe ;
    TextView rvsr ;
    TextView mesdoc ;
    ImageView prof ;
    ImageView bbckr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        spe =(TextView) findViewById(R.id.textView12);
        rvsr =(TextView) findViewById(R.id.textView15);
        mesdoc =(TextView) findViewById(R.id.textView14);
        prof =(ImageView) findViewById(R.id.imageView42);
        bbckr=(ImageView) findViewById(R.id.imageView10);
        spe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),MainSpecialite.class );
                startActivity(intent);
                finish();
            }

        });
        bbckr.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v){
               Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
           }
        });
        rvsr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),Mesrvpatient.class );
                startActivity(intent);
                finish();
            }

        });
        mesdoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),Mesdocteurs.class );
                startActivity(intent);
                finish();
            }

        });
        prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),MainActivity7.class );
                startActivity(intent);
                finish();
            }

        });
    }
}