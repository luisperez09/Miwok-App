package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        // Create list of words
        ArrayList<String> words = new ArrayList<String>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Seven");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");

        // Finds activity's root view
        LinearLayout numbersRootView = (LinearLayout) findViewById(R.id.numbers_root_view);
        // Creates TextViews in a loop to populate previously found ViewGroup
        for (int i = 0; i < words.size(); i++){
            TextView wordView = new TextView(this);
            wordView.setText(words.get(i));
            numbersRootView.addView(wordView);
        }
    }
}
