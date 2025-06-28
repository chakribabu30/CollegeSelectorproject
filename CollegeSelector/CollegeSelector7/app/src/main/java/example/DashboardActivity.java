package com.example.collegeselector;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    Button btnSelectProgram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button btnProfile = findViewById(R.id.btnProfile);
        btnProfile.setOnClickListener(v -> {
            startActivity(new Intent(DashboardActivity.this, ProfileActivity.class));
        });
        btnSelectProgram = findViewById(R.id.btnProgram);

        btnSelectProgram.setOnClickListener(v -> {
            startActivity(new Intent(DashboardActivity.this, ProgramSelectionActivity.class));
        });
    }
}

