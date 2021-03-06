
package com.example.mydoctor;

import android.content.Intent;
import android.util.Patterns;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;


public class Register extends AppCompatActivity {

    EditText name, email, phone, password;
    Button register;
    TextView loggin;
    boolean isNameValid, isEmailValid, isPhoneValid, isPasswordValid;
    TextInputLayout nameError, emailError, phoneError, passError;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mAuth = FirebaseAuth.getInstance();
        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        phone = (EditText) findViewById(R.id.phone);
        password = (EditText) findViewById(R.id.password);
        loggin = (TextView) findViewById(R.id.notregister);
        register = (Button) findViewById(R.id.register);
        nameError = (TextInputLayout) findViewById(R.id.nameError);
        emailError = (TextInputLayout) findViewById(R.id.emailError);
        phoneError = (TextInputLayout) findViewById(R.id.phoneError);
        passError = (TextInputLayout) findViewById(R.id.passError);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { SetValidation(); }
        });

        loggin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // redirect to LoginActivity
                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(intent);
            }
        });
    }


    public void SetValidation() {

        // Check for a valid name.
        if (name.getText().toString().isEmpty()) {
            nameError.setError("getResources().getString(R.string.name_error)");
            isNameValid = false;
        } else  {
            isNameValid = true;
            nameError.setErrorEnabled(false);
        }

        // Check for a valid email address.
        if (email.getText().toString().isEmpty()) {
            emailError.setError("getResources().getString(R.string.email_error)");
            isEmailValid = false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()) {
            emailError.setError("getResources().getString(R.string.error_invalid_email)");
            isEmailValid = false;
        } else  {
            isEmailValid = true;
            emailError.setErrorEnabled(false);
        }

        // Check for a valid phone number.
        if (phone.getText().toString().isEmpty()) {
            phoneError.setError("getResources().getString(R.string.phone_error)");
            isPhoneValid = false;
        } else  {
            isPhoneValid = true;
            phoneError.setErrorEnabled(false);
        }

        // Check for a valid password.
        if (password.getText().toString().isEmpty()) {
            passError.setError("getResources().getString(R.string.password_error)");
            isPasswordValid = false;
        } else if (password.getText().length() < 6) {
            passError.setError("getResources().getString(R.string.error_invalid_password)");
            isPasswordValid = false;
        } else  {
            isPasswordValid = true;
            passError.setErrorEnabled(false);
        }

        if (isNameValid && isEmailValid && isPhoneValid && isPasswordValid) {
            Toast.makeText(getApplicationContext(), "Successfully", Toast.LENGTH_SHORT).show();
        }
        mAuth.createUserWithEmailAndPassword(email, password).
        addOnCompleteListener(new OnCompleteListener<AuthResult>() {
         @Override
         public void onComplete(@NonNull Task<AuthResult> task) {
                     if (task.isSuccessful()) {
                         User user = new User( name, phone,  email,  password);
                       FirebaseDatabase.getInstance().getReference("Users")
                                  .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                              @Override
                             public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()){
                                     Toast.makeText(Register.this, "User has been registred successfully", Toast.LENGTH_SHORT).show();

          }
          else {
            Toast.makeText(Register.this, "Error!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();

           }
         }
        });
        } else {
            Toast.makeText(Register.this, "Error!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();

          }
         }

         });

         }




}