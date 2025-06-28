package com.example.collegeselector;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RankEntryActivity extends AppCompatActivity {

    EditText etRank;
    Button btnShowColleges;
    String selectedProgram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank_entry);

        etRank = findViewById(R.id.etRank);
        btnShowColleges = findViewById(R.id.btnShowColleges);

        // Get selected program from previous activity
        selectedProgram = getIntent().getStringExtra("program");

        btnShowColleges.setOnClickListener(v -> {
            String enteredRank = etRank.getText().toString();

            // Check if rank is empty
            if (enteredRank.isEmpty()) {
                Toast.makeText(RankEntryActivity.this, "Please enter your rank", Toast.LENGTH_SHORT).show();
            } else {
                try {
                    // Parse the rank to an integer
                    int rank = Integer.parseInt(enteredRank);

                    // Pass rank and selected program to the next activity
                    Intent intent = new Intent(RankEntryActivity.this, EligibleCollegesActivity.class);
                    intent.putExtra("rank", rank); // userRank should be the rank entered by the user
                    intent.putExtra("program", selectedProgram);
                    startActivity(intent);
                } catch (NumberFormatException e) {
                    // Handle the case where the input is not a valid number
                    Toast.makeText(RankEntryActivity.this, "Please enter a valid rank", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}


