package com.example.collegeselector;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import example.College;
import example.CollegeData;

public class EligibleCollegesActivity extends AppCompatActivity {

    ListView listViewColleges;
    ArrayList<College> eligibleColleges;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eligible_colleges);
        Toast.makeText(this, "Entered EligibleCollegesActivity", Toast.LENGTH_SHORT).show();

        listViewColleges = findViewById(R.id.listViewColleges);

        // Get data from intent
        int userRank = getIntent().getIntExtra("rank", -1);
        String selectedProgram = getIntent().getStringExtra("program");

        Log.d("EligibleColleges", "Rank: " + userRank);
        Log.d("EligibleColleges", "Program: " + selectedProgram);

        // Fetch eligible colleges based on program and rank
        eligibleColleges = CollegeData.getAllColleges(selectedProgram, userRank);
        Log.d("EligibleColleges", "Total Colleges: " + eligibleColleges.size());

        ArrayList<College> filteredColleges = new ArrayList<>();
        for (College college : eligibleColleges) {
            if (college.isEligible(selectedProgram, userRank)) {
                filteredColleges.add(college);
                Log.d("EligibleColleges", "Filtered Colleges Count: " + filteredColleges.size());
            }
        }

        if (filteredColleges.isEmpty()) {
            Toast.makeText(this, "No eligible colleges found.", Toast.LENGTH_SHORT).show();
        }

        // Use ArrayAdapter with toString() for displaying colleges
        ArrayAdapter<College> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, filteredColleges);
        listViewColleges.setAdapter(adapter);

        // On item click, pass college details to MapsActivity
        listViewColleges.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                College selectedCollege = filteredColleges.get(position);

                Intent intent = new Intent(EligibleCollegesActivity.this, MapsActivity.class);
                intent.putExtra("college_name", selectedCollege.getName());
                intent.putExtra("latitude", selectedCollege.getLatitude());
                intent.putExtra("longitude", selectedCollege.getLongitude());
                startActivity(intent);
            }
        });
    }
}







