package com.example.mydoctor;

import android.content.Intent;
import android.util.Patterns;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity4 extends AppCompatActivity {

    EditText email, password;
    Button login;
    TextView register;
    boolean isEmailValid, isPasswordValid;
    TextInputLayout emailError, passError;
    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://testfirst-c8354-default-rtdb.firebaseio.com/");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        register = findViewById(R.id.textView4);
        emailError = findViewById(R.id.emailError);
        passError = findViewById(R.id.passError);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetValidation();
                Intent intent = new Intent(getApplicationContext(),MainMenudocteur.class);
                startActivity(intent);

            }
        });


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // redirect to RegisterActivity
                Intent intent = new Intent(getApplicationContext(),Register.class);
                startActivity(intent);
            }
        });
    }

    public void SetValidation() {
        // Check for a valid email address.
        if (email.getText().toString().isEmpty()) {
            emailError.setError("Please enter your email address");
            isEmailValid = false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()) {
            emailError.setError("this email address is invalid");
            isEmailValid = false;
        } else  {
            isEmailValid = true;
            emailError.setErrorEnabled(false);
        }

        // Check for a valid password.
        if (password.getText().toString().isEmpty()) {
            passError.setError("Please enter a password");
            isPasswordValid = false;
        } else if (password.getText().length() < 6) {
            passError.setError("this password is invalid");
            isPasswordValid = false;
        } else  {
            isPasswordValid = true;
            passError.setErrorEnabled(false);
        }

        if (isEmailValid && isPasswordValid) {
            Toast.makeText(getApplicationContext(), "Successfully", Toast.LENGTH_SHORT).show();
        }

    }

}

