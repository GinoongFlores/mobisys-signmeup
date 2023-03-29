package com.example.activitylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtFirstName, edtLastName, edtEmail, edtPassword, editConfirmPassword;
    Button btnSignUp;

    public static final String EXTRA_MESSAGE = "com.example.registration.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtFirstName = findViewById(R.id.edt_FirstName);
        edtLastName = findViewById(R.id.edt_LastName);
        edtEmail = findViewById(R.id.edt_Email);
        edtPassword = findViewById(R.id.edt_Password);
        editConfirmPassword = findViewById(R.id.edt_ConfirmPassword);

        btnSignUp = findViewById(R.id.btn_SignUp);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstName, lastName, email, password, confirmPassword;
                firstName = edtFirstName.getText().toString();
                lastName = edtLastName.getText().toString();
                email = edtEmail.getText().toString();
                password = edtPassword.getText().toString();
                confirmPassword = editConfirmPassword.getText().toString();

                if(confirmPassword.equalsIgnoreCase(password)) {
                    Intent intent = new Intent(MainActivity.this, NextActivity.class);
                    intent.putExtra(EXTRA_MESSAGE, "Full name: " + firstName + " " + lastName + "\n" + "Email: " + email + "\n" + "Password: " + password + "\n");
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Password don't match!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}