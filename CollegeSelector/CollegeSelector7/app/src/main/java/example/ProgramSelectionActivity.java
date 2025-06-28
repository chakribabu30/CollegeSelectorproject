package com.example.collegeselector;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ProgramSelectionActivity extends AppCompatActivity {

    Spinner spinnerProgram;
    Button btnNext;
    String selectedProgram = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_selection);

        spinnerProgram = findViewById(R.id.spinnerProgram);
        btnNext = findViewById(R.id.btnNextProgram);

        // Programs list (excluding "Select Program" from options)
        String[] programs = {"B.Tech", "Medical", "Law", "MBA", "Pharmacy", "Architecture"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, programs);
        spinnerProgram.setAdapter(adapter);

        // Spinner item selection listener
        spinnerProgram.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedProgram = programs[position];
                Log.d("ProgramSelection", "Selected Program: " + selectedProgram); // Debugging line to check selection
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selectedProgram = "";
                Log.d("ProgramSelection", "No Program Selected"); // Debugging line to check if no program is selected
            }
        });

        // Button click listener to navigate to the next activity
        btnNext.setOnClickListener(v -> {
            if (selectedProgram.equals("") || selectedProgram.equals("Select Program")) {
                Toast.makeText(this, "Please select a valid program", Toast.LENGTH_SHORT).show();
            } else {
                Log.d("ProgramSelection", "Navigating to RankEntryActivity with Program: " + selectedProgram); // Debugging line
                Intent intent = new Intent(ProgramSelectionActivity.this, RankEntryActivity.class);
                intent.putExtra("program", selectedProgram);
                startActivity(intent);
            }
        });
    }
}



