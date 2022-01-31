
package com.example.mydoctor;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageButton;
        import android.widget.ImageView;
        import android.widget.TextView;

public class MainSpecialite extends AppCompatActivity {
    ImageButton specialite;
    ImageView bacr ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_specialite);
        specialite = (ImageButton) findViewById(R.id.imageButton22);
        specialite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // redirect to RegisterActivity
                Intent intent = new Intent(getApplicationContext(),MainActivity8.class);
                startActivity(intent);
            }
        });
        bacr=(ImageView)findViewById(R.id.imageView8);
        bacr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),MainActivity5.class);
                startActivity(intent);
            }
        });

    }
}