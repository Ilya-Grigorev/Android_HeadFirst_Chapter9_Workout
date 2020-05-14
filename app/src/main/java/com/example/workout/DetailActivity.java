package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

// github:
// Android_HeadFirst_Chapter9_Workout

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        WorkoutDetailFragment frag = (WorkoutDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        frag.setWorkout(1);


    }


}
