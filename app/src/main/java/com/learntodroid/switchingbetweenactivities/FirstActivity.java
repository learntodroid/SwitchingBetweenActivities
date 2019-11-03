package com.learntodroid.switchingbetweenactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {
    Button switchToSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        switchToSecondActivity = findViewById(R.id.activity_first_button);
        switchToSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivities();
//                switchActivitiesWithData();
            }
        });
    }

    private void switchActivities() {
        Intent switchActivityIntent = new Intent(this, SecondActivity.class);
        startActivity(switchActivityIntent);
    }

    private void switchActivitiesWithData() {
        Intent switchActivityIntent = new Intent(this, SecondActivity.class);
        switchActivityIntent.putExtra("message", "From: " + FirstActivity.class.getSimpleName());
        startActivity(switchActivityIntent);
    }
}
