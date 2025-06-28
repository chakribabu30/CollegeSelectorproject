package com.example.collegeselector;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class PreferenceActivity extends AppCompatActivity {

    CheckBox cbLocation, cbFees, cbRanking;
    Button btnSavePreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference);

        cbLocation = findViewById(R.id.cbLocation);
        cbFees = findViewById(R.id.cbFees);
        cbRanking = findViewById(R.id.cbRanking);
        btnSavePreferences = findViewById(R.id.btnSavePreferences);

        btnSavePreferences.setOnClickListener(v -> {
            String msg = "Preferences Saved!";
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        });
    }
}
