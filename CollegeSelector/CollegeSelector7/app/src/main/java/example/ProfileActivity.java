package com.example.collegeselector;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    TextView tvUsername, tvEmail, tvProgram, tvRank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvUsername = findViewById(R.id.tvUsername);
        tvEmail = findViewById(R.id.tvEmail);
        tvProgram = findViewById(R.id.tvProgram);
        tvRank = findViewById(R.id.tvRank);

        SharedPreferences prefs = getSharedPreferences("UserProfile", MODE_PRIVATE);
        tvUsername.setText("Username: " + prefs.getString("username", ""));
        tvEmail.setText("Email: " + prefs.getString("email", ""));
        tvProgram.setText("Program: " + prefs.getString("program", ""));
        tvRank.setText("Rank: " + prefs.getInt("rank", 0));
    }
}
