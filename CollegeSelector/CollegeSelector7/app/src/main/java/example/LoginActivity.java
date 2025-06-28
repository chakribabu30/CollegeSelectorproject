package com.example.collegeselector;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText etLoginUsername, etLoginPassword;
    Button btnLogin, btnSignup;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etLoginUsername = findViewById(R.id.etLoginUsername);
        etLoginPassword = findViewById(R.id.etLoginPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnSignup = findViewById(R.id.btnSignup);

        sharedPreferences = getSharedPreferences("UserPrefs", Context.MODE_PRIVATE);

        btnLogin.setOnClickListener(v -> {
            String inputUser = etLoginUsername.getText().toString();
            String inputPass = etLoginPassword.getText().toString();

            String savedUser = sharedPreferences.getString("username", "");
            String savedPass = sharedPreferences.getString("password", "");

            if (inputUser.equals(savedUser) && inputPass.equals(savedPass)) {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, DashboardActivity.class));
                finish();
            } else {
                Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
            }
        });

        btnSignup.setOnClickListener(v -> {
            startActivity(new Intent(this, SignupActivity.class));
        });
    }
}

